package LinearSearch;

public class SearchASpecificWord {
    public static void main(String[] args) {
        String[] words = {"My name is Rishav Raj,"," I was born and bought up in this city of Patna,"," capital of Bihar." ,
                " I have completed my formal education from the city itself", "and currently,",
                " I am a finally a student at Technocrats institute of technology in" ,
                " computer science and engineering discipline having",
                " majors in artificial intelligence and data science.\n"};
        String specificWord="Rishav";
        System.out.println("The index of the given word in the list is : "+LinearSearch.indexOfWord(words, specificWord));
    }
}
