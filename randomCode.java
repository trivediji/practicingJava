import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class randomCode extends Canvas implements Runnable {

    ArrayList<Boid> boids;

    public randomCode() {
        boids = new ArrayList<>();
        // Initialize boids with safe starting positions and velocities
        for (int i = 0; i < 50; i++) {
            boids.add(new Boid(width / 2, height / 2, 1));
        }
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            updateBoids();
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateBoids() {
        for (Boid boid : boids) {
            boid.applyRules();
            boid.update();
            // Keep boids within safe boundaries
            boid.checkBounds();
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.WHITE);
        for (Boid boid : boids) {
            boid.draw(g);
        }
    }

    public static void main(String[] args) {
        randomCode simulation = new randomCode();
        simulation.setSize(400, 400);
        new javax.swing.JFrame("Flocking Simulation").add(simulation).setVisible(true);
    }
}
