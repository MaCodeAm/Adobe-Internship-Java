package week4.task1;

import java.util.Arrays;

public class UserGroup {

    private User[] users = new User[10];
    private int index = 0;

    public void addUser(User user) {
        if (isIncreaseNeeded()) {
            increaseArray();
        }
        users[index++] = user;
    }

    private void increaseArray() {
        User[] newUsers = new User[users.length * 2];
        for (int i = 0; i < index; i++) {
            newUsers[i] = users[i];
        }
        users = newUsers;
    }

    private boolean isIncreaseNeeded() {
        return users[users.length - 1] != null;

    }

    @Override
    protected UserGroup clone() throws CloneNotSupportedException {
        UserGroup userGroup = new UserGroup();
        userGroup.users = new User[this.users.length];
        for (int i = 0; i < index; i++) {
            userGroup.users[i] = users[i].clone();
        }

        return new UserGroup();
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + Arrays.toString(users) +
                ", index=" + index +
                '}';
    }
}
