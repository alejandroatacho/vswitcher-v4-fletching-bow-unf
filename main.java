//____________________________________________________________________________________________
//Choose which log you want to use and then which bow type longbow or short
//____________________________________________________________________________________________
//User Variables to pick
int log_decision = 2;
//0 = magic 
//1 = yew 
//2 = maple
//3 = willow
//4 == oak
//5 == normal
int bow_decision = 0; // 0 = Longbow, 1 = Shortbow
// 0 = Longbow
//1 = Shortbow
//__________________________________________________________________________________________


//Hinamizawa's Variables Don't touch!

//Variables
int knife = 946;
int knife_slot = v.getInventory().slot(knife);

//decision == 0
int log_0 = 1513; //magic log
int log_slot_0 = v.getInventory().slot(log_0);
int deposit_item_0 = 70; //magic long
int deposit_item_2_0 = deposit_item_0 + 2; //magic short

//decision == 1
int log_1 = 1515; //yew log
int log_slot_1 = v.getInventory().slot(log_1);
int deposit_item_1 = 66; //yew long
int deposit_item_1_1 = deposit_item_1 + 2; //yew short

//decision == 2
int log_2 = 1517; //maple log
int log_slot_2 = v.getInventory().slot(log_2);
int deposit_item_2 = 62; //maple long
int deposit_item_2_2 = deposit_item_2 + 2; //maple short

//decision == 3
int log_3 = 1519; //Willow log
int log_slot_3 = v.getInventory().slot(log_3);
int deposit_item_3 = 58; //willow long
int deposit_item_3_3 = deposit_item_3 + 2; //willow short

//decision == 4
int log_4 = 1521; //Oak log
int log_slot_4 = v.getInventory().slot(log_4);
int deposit_item_4 = 56; //Oak long
int deposit_item_4_4 = deposit_item_4 - 2; //Oak short

//decision == 5
int log_5 = 1511; // normal log
int log_slot_5 = v.getInventory().slot(log_5);
int deposit_item_5 = 48; //normal long
int deposit_item_5_5 = deposit_item_5 + 2; //normal short

//D0
if (log_decision == 0){
     if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_0, 27,27) || v.getInventory().amountInInventory(deposit_item_2_0, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_0, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_2_0, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_0, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Magic longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Magic shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Magic logs</col>",0,58,27,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_0,27);
        }
    }
}

//D1
else if (log_decision == 1){
         if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_1, 27,27) || v.getInventory().amountInInventory(deposit_item_1_1, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_1, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_1_1, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_1, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Yew longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Yew shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Yew logs</col>",0,58,27,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_1,27);
        }
    }
}

//D2
else if (log_decision == 2){
    if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_2, 27,27) || v.getInventory().amountInInventory(deposit_item_2_2, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_2, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_2_2, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_2, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Maple longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Maple shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Maple logs</col>",0,58,log_slot_2,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_2,27);
        }
    }
}

//D3
else if (log_decision == 3){
    if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_3, 27,27) || v.getInventory().amountInInventory(deposit_item_3_3, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_3, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_3_3, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_3, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Willow longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Willow shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Willow logs</col>",0,58,log_slot_3,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_3,27);
        }
    }
}

//D4
else if (log_decision == 4){
    if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_4, 27,27) || v.getInventory().amountInInventory(deposit_item_4_4, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_4, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_4_4, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_4, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Oak longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Oak shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Oak logs</col>",0,58,log_slot_4,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_4,27);
        }
    }
}

//D5
else if (log_decision == 5){
    if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_5, 27,27) || v.getInventory().amountInInventory(deposit_item_5_5, 27,27)) {
        if (bow_decision == 0) {
            v.getBank().deposit(deposit_item_5, 27);
        } else if (bow_decision == 1)
        {
            v.getBank().deposit(deposit_item_5_5, 27);

        }
        

        } 
        else if(v.getInventory().amountInInventory(log_5, 1,27)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                    v.invoke("Make","<col=ff9040>Longbow</col>",1,57,-1,17694736,false);
                    }
                    else if (bow_decision == 1) {
                        v.invoke("Make","<col=ff9040>Shortbow</col>",1,57,-1,17694735,false);
                    }
                } else {
                    v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                    v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Logs</col>",0,58,log_slot_5,9764864,false);
                }
            }
        } else {
            v.getBank().withdraw(log_5,27);
        }
    }
}

