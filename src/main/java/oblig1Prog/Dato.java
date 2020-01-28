package oblig1Prog;

public class Dato {
    int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;

        String ut = dag + "." + måned + "." + år;
    }

    @Override
    public String toString(){
        return dag + "." + måned + "." + år;
    }

}
