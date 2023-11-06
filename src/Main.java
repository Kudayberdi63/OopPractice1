public class Main {
    public static void main(String[] args) {
        Posword posword = new Posword(634354, "Kudayberdi", "Gapurov",
                "Kyrgyzstan", "Myjskoy", "29.08.2006");

        System.out.println("фамилия : " + posword.lastNAme +
                "\n" + "имя : " + posword.firstName + "\n" + "айди : " + posword.id +
                "\n" + "дата : " + posword.data + "\n" +
                "страна :" + posword.country + "\n" + "пол : " + posword.gender);

    }
}