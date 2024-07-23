## All-in-One Fletching Bot
Gametick trigger: 3 (could use gametick trigger only, didn't test it like that)

This script allows you to fletch different types of logs into either shortbows or longbows. You can specify the log type and the type of bow to fletch.

### Setup
1. Copy the provided Java code into your code editor.
2. Save the file with an appropriate name.
3. Make sure you have a Knife in your inventory
4. Stand infront of a bank (varrock example)
5. Start the script.
6. The script will perform the following actions based on the log type and bow type selected:

   - If `log_decision` is 0 (magic log):
     - Fletch magic longbows or magic shortbows based on the `bow_decision`.
   - If `log_decision` is 1 (yew log):
     - Fletch yew longbows or yew shortbows based on the `bow_decision`.
   - If `log_decision` is 2 (maple log):
     - Fletch maple longbows or maple shortbows based on the `bow_decision`.
   - If `log_decision` is 3 (willow log):
     - Fletch willow longbows or willow shortbows based on the `bow_decision`.
   - If `log_decision` is 4 (oak log):
     - Fletch oak longbows or oak shortbows based on the `bow_decision`.
   - If `log_decision` is 5 (normal log):
     - Fletch longbows or shortbows based on the `bow_decision`.

---

**Note**: The information provided above is for reference only. Please ensure that you understand the code and its implications before implementing it in Vswitcher.