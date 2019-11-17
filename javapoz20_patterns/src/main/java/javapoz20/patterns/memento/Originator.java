package javapoz20.patterns.memento;

import java.util.Random;

public class Originator {
    private int[] state = new int[10];

    public void randomState() {
        Random random = new Random();
        for (int i = 0; i < state.length; i++) {
            state[i] = random.nextInt();
        }
    }

    public void printState() {
        for (int i = 0; i < state.length; i++) {
            System.out.print(state[i] + " ");
        }
        System.out.println();
    }

    public Memento getMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public final class Memento {
        private int[] state = new int[10];

        private Memento(int[] state) {
            System.arraycopy(state, 0, this.state, 0, state.length);
        }

        private int[] getState() {
            return state;
        }
    }
}
