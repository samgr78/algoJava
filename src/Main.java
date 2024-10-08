//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Permet de trouver l'index d'un nombre dans un tableau
     * @param tab un tableau
     * @param a un entier a trouver dans le tab
     * @return l'index de l'entier ou -1 si l'entier n'est pas dans le tab
     */
    static int rechercheLineaire(int [] tab,int  a){
        for (int i=0; i<tab.length; i++){
            if (tab[i]==a){
                return i;
            }
        }
        return -1;
    }
    static int rechercheBinaire(int [] tab, int a) {
        int min = 0;
        int max = tab.length-1;
        int mid;
        while (min <= max) {
            mid = (min+max) / 2;
            if (a == tab[mid]) {
                return mid;
            }
            if (a < tab[mid]) {
                max = mid -1;
            }
            else {
                min = mid+1;
            }
        }
        return -1;
    }
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
    System.out.println(score);
    int [] abc=new int [7];
    abc[0]=2;
    abc[1]=3;
    abc[2]=5;
    abc[3]=7;
    abc[4]=8;
    abc[5]=9;
    abc[6]=10;
    System.out.println(rechercheLineaire(abc, 4));
    System.out.println(rechercheBinaire(abc, 5));
    }
}