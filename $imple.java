class ball {
  int age;
  String gender;
  String name;

  void arbaz() {
    age = 10;
    gender = "female";
    name = "Arbaz chachi"; 
    System.out.println("Enter the Name,Age & Gender");
  }
}

class $imple extends ball {
  void display() {
    System.out.println(name + " her gender is " + gender + " her age is " + age);

  }

  public static void main(String[] args) {
    $imple ref = new $imple();
    ref.arbaz();
    ref.display();
  }
}
