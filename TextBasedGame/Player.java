// Player.java
public class Player {
    private Room currentRoom;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void moveLeft() {
        if (currentRoom.getLeftRoom() != null) {
            setCurrentRoom(currentRoom.getLeftRoom());
        } else {
            System.out.println("////THE LEFT DOOR WON'T OPEN!////");
        }
    }

    public void moveRight() {
        if (currentRoom.getRightRoom() != null) {
            setCurrentRoom(currentRoom.getRightRoom());
        } else {
            System.out.println("////THE RIGHT DOOR WON'T OPEN!////");
        }
    }

    public void moveBack() {
        if (currentRoom.getBackRoom() != null) {
            setCurrentRoom(currentRoom.getBackRoom());
        } else {
            System.out.println("////THE BACK DOOR WON'T OPEN!////");
        }
    }
    
    public void checkPaths() {
        String leftRoomName, rightRoomName, backRoomName;
        try{
            leftRoomName = currentRoom.getLeftRoom().getName();
        }
        catch (NullPointerException e) {
            leftRoomName = "Wont open";
        }
        try {
            rightRoomName = currentRoom.getRightRoom().getName();
        }
        catch (NullPointerException e) {
            rightRoomName = "Wont open"; 
        }
        try {
            backRoomName = currentRoom.getBackRoom().getName();
        }
        catch (NullPointerException e) {
            backRoomName = "Wont open"; 
        }
        System.out.printf("Left Room: %s\nRight Room: %s\nBack Room: %s\n", leftRoomName, rightRoomName, backRoomName);
    }
}
