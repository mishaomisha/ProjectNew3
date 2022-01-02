package original.model;

import java.util.ArrayList;

public class Channel {
    private Person Admin ;
    private String name ;
    private ArrayList<Person> member_list = new ArrayList<Person>();
    private ArrayList<String> Message_list = new ArrayList<String>();
    private ArrayList<String> Sender_list = new ArrayList<String>();

    public Person getAdmin() {
        return Admin;
    }

    public void setAdmin(Person admin) {
        Admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getMember_list() {
        return member_list;
    }

    public void setMember_list(ArrayList<Person> member_list) {
        this.member_list = member_list;
    }

    public ArrayList<String> getMessage_list() {
        return Message_list;
    }

    public void setMessage_list(ArrayList<String> message_list) {
        Message_list = message_list;
    }

    public ArrayList<String> getSender_list() {
        return Sender_list;
    }

    public void setSender_list(ArrayList<String> sender_list) {
        Sender_list = sender_list;
    }
}
