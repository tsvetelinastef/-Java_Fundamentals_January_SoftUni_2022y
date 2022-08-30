package ExamPreparationPart1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex3_HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1ва част - данни за героя
        int n = Integer.parseInt(scanner.nextLine()); // count of heroes

        // данни за герои

         // герои - mp (цяло число)
        Map<String, Integer> heroesMP = new TreeMap<>();
        //  мапове, които държат данните за героите

        // герои - hp (цяло число)
        Map<String, Integer> heroesHP = new TreeMap<>();

        // после всеки един герой от 1вия до n- тия
        for (int hero = 1; hero <= n; hero++) {
            // за всеки един герой прочитам неговата data
            String data = scanner.nextLine(); // {hero name} {HP} {MP}
            String[] splitData = data.split("\\s+"); // държа сплитната data
            String heroName = splitData[0]; // т.като data са ми данни, разделени с интервал елемента на нулевиа позиция
            // {hero name} = 0 , {HP} = 1 , {MP} = 2
            int hp = Integer.parseInt(splitData[1]);
            int mp = Integer.parseInt(splitData[2]);

            // max hp e 100
            if(hp <= 100){
                heroesHP.put(heroName, hp);
            }

            // map mp e 200
            if(mp <= 200){
                heroesMP.put(heroName, mp); // срещу heroName ми постави mp
            }
        }

        // 2. команди
        String command = scanner.nextLine();
        while(!command.equals("End")){
            String [] commandParams = command.split(" - ");
            String commandName = commandParams[0];
            String heroName = commandParams[1];

            // "CastSpell", "{hero name}", "{MP needed}", "{spell name}"
            // "TakeDamage - {hero name} - {damage} - {attacker}           ["TakeDamage", "{hero name}", "{damage}", "{attacker}"
            // Recharge - {hero name} - {amount}                           ["Recharge", "{hero name}", "{amount}"]
            // Heal - {hero name} - {amount}                               ["Heal", "{hero name}", "{amount}"]

            switch (commandName){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParams[2]);
                    String spellName = commandParams[3];
                    int currentMp = heroesMP.get(heroName);
                    // изпълнена магията
                    if(currentMp >= mpNeeded){
                        int mpLeft = currentMp - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    // ако не я изпълняваме
                    else{
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParams[2]);
                    String attacker = commandParams[3];
                    int currentHP = heroesHP.get(heroName);
                    int leftHP = currentHP - damage;
                    // жив
                    if (leftHP > 0){
                        heroesHP.put(heroName, leftHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage,attacker, leftHP);
                    }
                    // умрял
                    else{
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amountRecharge = Integer.parseInt(commandParams[2]);
                    int currentMpForRecharge = heroesMP.get(heroName);
                    int increasesMp = currentMpForRecharge + amountRecharge;
                    if(increasesMp > 200){
                        increasesMp = 200;
                    }

                    heroesMP.put(heroName, increasesMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increasesMp - currentMpForRecharge);
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(commandParams[2]);
                    int currentHPForHeal = heroesHP.get(heroName);
                    int increasedHP = currentHPForHeal + amountHeal;
                    if (increasedHP > 100){
                        increasedHP = 100;
                    }

                    heroesHP.put(heroName, increasedHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, increasedHP - currentHPForHeal);
                    break;
            }

            command = scanner.nextLine();
        }
        heroesHP.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(heroEntry -> {
                    // име на героя
                    String heroName = heroEntry.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + heroEntry.getValue());
                    System.out.println("  MP: " + heroesMP.get(heroName));
                });

    }
}
