package oblig1Prog;

public class Dato {
    int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;

    }

    @Override
    public String toString() {
        String txtDag = String.format("%02d", dag);
        String txtMåned = String.format("%02d", måned);
        String txtÅr = String.format("%02d", år);
        return txtDag + "." + txtMåned + "." + txtÅr;
    }

}
