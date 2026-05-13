import java.util.Random;
class ReunionVirtual{
    private String Enlace;
    public ReunionVirtual(){
        Random r=new Random();
        Random x=new Random();
        String s="https://Reunion_";
        for (int i=0;i<10;i++){
            int Probabilidad= (int)(x.nextInt(3));
            if(Probabilidad==0) {
                char random = (char) (r.nextInt(57- 48 + 1) + 48);
                s = s + random;
            }
            else if(Probabilidad==1){
                char random = (char) (r.nextInt(90 - 65 + 1) + 65);
                s = s + random;
            }
            else{
                char random = (char) (r.nextInt(122 - 97 + 1) + 97);
                s = s + random;
            }
        }
        this.Enlace=s;
    }
}
