package oblig1Prog;

public class Dato {
    int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        try{
            Validering.datoSjekk(dag, måned, år);
        } catch (InvalidDateException e) {
            throw e;
        }
        this.dag = dag;
        this.måned = måned;
        this.år = år;

    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {

        this.dag = dag;
    }

    public int getMåned() {
        return måned;
    }

    public void setMåned(int måned) {
        this.måned = måned;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
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
