package com.company;

public class Remote {
    public Command[] onCommands;
    public Command[] offCommands;

    public Remote() {
        this.onCommands = new Command[6];
        this.offCommands = new Command[6];

        for (int i = 0; i < 6; i++){
            onCommands[i] = () ->{};
            offCommands[i] = () ->{};
        }
    }

    public void setCommand (int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOn(int slot){
        System.out.println("\nOn command " +  slot + " was pushed");
        onCommands[slot].execute();
    }

    public void pushOff(int slot){
        System.out.println("\nOff command " +  slot + " was pushed");
        offCommands[slot].execute();
    }

}
