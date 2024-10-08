//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Renvoie boolean si une valeur du tableau<10
     * @param tab a tab
     * @return boolean if i<10
     **/
    static boolean superieur(int [] tab ){
        for (int i=0; i<tab.length; i++){
            if (tab[i] < 10){
                return true;
            }
        }
        return false;
    }
    /**
     * Renvoie la valeur max du tableau
     * @param tab un tableau
     * @return valeur max
     **/
    static int maximum(int [] tab){
        int max= 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
    int cpt =0;
    int [] score=new int[7];
    for (int i = 0; i < score.length; i++) {
        score[i]= i;
        cpt+=i;
        System.out.print(score[i]+ " ");

    }
    System.out.println("\n" + "Moyenne = " + cpt/score.length);
    System.out.println(maximum(score));
    System.out.println(superieur(score));
    }
}