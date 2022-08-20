package homework.books.storage;


import homework.books.model.User;

public class UserStorage {
    private User[] array = new User[10];
    private int size = 0;


    public void add(User User) {
        if (size == array.length) {
            increaseArray();
        }


        array[size++] = User;
    }

    private void increaseArray() {
        User[] temp = new User[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }


    public void bookUserUser(String UserUser) {
        for (int i = 0; i < size; i++) {
            if (array[i].UserUser().equals(UserUser)) {
                System.out.println(array[i]);
            }
        }

    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }

            size--;
            System.out.println("author deleted");
        } else
            System.out.println("Index out of bounds");
    }

    public int getSize() {

        return size;
    }

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)){
                return array[i];
            }
        }
      return null;

    }

}


