class Main {
    public static void main(String[] args) {
        Reader rinat = new Reader("Агишев.Р.А", 1,"Ин-Тех", "2003.03.03", 89052325544L);
        Reader ilya = new Reader("Неронов.И.С", 2,"Ин-Тех", "2005.05.03", 89022545342L);
        Reader artem = new Reader("Калеганов.А.А", 3,"Ин-Тех", "2005.02.02", 89532226564L);
        Reader aslan = new Reader("Сафаров.А.А", 4,"Ин-Тех", "2006.06.06", 89236324584L);
        Reader niga = new Reader("Нигеров.Н.Н", 5,"Ин-Тех", "666.06.06", 66666666666L);

        Reader[] massiv = new Reader[5];
        massiv[0] = rinat;
        massiv[1] = ilya;
        massiv[2] = artem;
        massiv[3] = aslan;
        massiv[4] = niga;
    }

}

class Reader{
    String FIO;
    int ticket_num;
    String fakultet;
    String birth_date;
    long phone;

    Reader(String FIO, int ticket_num , String fakultet,  String birth_date, long phone){
        this.FIO = FIO;
        this.ticket_num = ticket_num;
        this.fakultet = fakultet;
        this.birth_date = birth_date;
        this.phone = phone;
    }

    public void takeBook(int count){
        System.out.println(FIO + "Взял " + count + " книги");
    }

    public void takeBook(String... books){
        System.out.print(FIO + " взял книги: ");
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
    public void returnBook(int count){
        System.out.println(FIO + "вернул " + count + " книги");
    }

    public void returnBook(String... books){
        System.out.print(FIO + " вернул книги: ");
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
}
