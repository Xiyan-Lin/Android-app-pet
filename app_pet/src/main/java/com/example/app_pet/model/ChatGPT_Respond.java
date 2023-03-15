package com.example.app_pet.model;
import android.app.usage.UsageEvents;

import java.text.ChoiceFormat;
import java.util.ArrayList;

public class ChatGPT_Respond {
    public String id;
    public String object;
    public int created;
    public String model;
    public ArrayList<ChoiceFormat> choices;
    public UsageEvents usage;
}
