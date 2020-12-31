class StaticMethod {
    public static void main(String[] args) {
        String hasil = Main.salam();
    }
    public static String salam(){
        String hasil = "Salam Programmer!";
        System.out.println(hasil);
        return hasil;
    }
}