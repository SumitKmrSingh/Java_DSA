// Sample Problem: DS for balance in Java

/* Sample Problem: The task is to design a e-Wallet. We are given with user id's and respective
balances and we need to design a data structure to maintain these balances with user ids.

We will perform the following two kinds of operation on the designed data structure:
set(user id, balance): If the user id given doesn't exist in the ds, this method will insert this
user id along with the balance provided. If the user id already exists, then this method will
update the previous balance corresponding to this user id.
get(user id): This method will return the balance corresponding to the given user id.


Example:
Input:
set(1, 100)
set(2, 2000)
get(1)
set(1, 5000)
get(1)
get(2)
Output:
1 -> 100
1 -> 5000
2 -> 2000



Solution: The idea to efficiently implement such data structure is to use HashMaps in Java because
it allows us to search for an item in O(1) time and also insert/update in O(1) time.

We can simply create a HashMap in Java with user ids as keys and their corresponding balance as
value, whenever we call get() method, it will simply return the corresponding value for the user
id, and whenever we call set() method, it will insert/update value corresponding to the given
key. */

package CollectionFramwork.HashMap;

import java.util.HashMap;

class UserList{
    HashMap<Integer, Integer> m;
    UserList(){
        m = new HashMap<Integer, Integer>();
    }

    int get(int id){
        return m.get(id);
    }

    void set(int id, int balance){
        m.put(id, balance);
    }
}
public class DSForBalance {
    public static void main(String[] args) {
        UserList users = new UserList();
        users.set(1, 1000);
        users.set(2, 2000);
        System.out.println(users.get(1));

        users.set(1, 50000);
        System.out.println(users.get(2));
        System.out.println(users.get(1));
    }
}
