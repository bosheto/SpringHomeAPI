package com.bgezkov.homeapi.models;

public class Machine {

    private int id;
    private String name;
    private int vmID;
    private String IPv4;
    private String IPv6;
    private String description;

    public Machine(){

    }

    public Machine(int id, String name, int vmID, String IPv4, String IPv6, String description) {
        this.id = id;
        this.name = name;
        this.vmID = vmID;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVmID(int vmID) {
        this.vmID = vmID;
    }

    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVmID() {
        return vmID;
    }

    public String getIPv4() {
        return IPv4;
    }

    public String getIPv6() {
        return IPv6;
    }

    public String getDescription() {
        return description;
    }






}
