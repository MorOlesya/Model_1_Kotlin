fun main() {
    val elf = Hero()
    val voin = Hero()
    val friendlyCharacter  = Character()

    val ork = Enemy()
    val dragon = Enemy()
    val enemyCharacter = Character()

    elf.createHero("Emir", 5,150,23,50,"Посох", "Огонь")
    friendlyCharacter.createFriendlyCharacter(elf)
    voin.createHero("Eren", 10,150,50,0,"Меч", "Физ")
    friendlyCharacter.createFriendlyCharacter(voin)
    println("================")
    elf.Info()
    println()
    voin.Info()
    println("================")

    ork.createEnemy("Орк", 10, 200, 44, "Физ")
    enemyCharacter.createEnemyCharacter(ork)
    dragon.createEnemy("Драгон", 15, 100, 60, "Огонь")
    enemyCharacter.createEnemyCharacter(dragon)
    println("================")
    ork.Info()
    println()
    dragon.Info()
    println("================")

    println("Дружелюбные персонажи")
    friendlyCharacter.printFriendlyCharacters()
    println("Враги")
    enemyCharacter.printEnemyCharacters()
    println("================")

    elf.CastSpell()
    elf.Attack(elf, ork)
    println()
    ork.Attack(voin, ork)
    println("================")
    val user = Hero()
    user.createHero("User", 5,150,23,50,"Посох", "Огонь")

    while (true) {
        println("==== КВЕСТ ====")
        println("Всего 3 задания")
        println("Цель - найти сокровище и пройти до конца")
        println("================")
        println("Задание 1 - выбрать правильную дверь")
        println("================")
        println("Всего 3 дверей. За одной мгноваенная смерть, за другой монстр, за третей проход. (нужно ввести номер двери)")
        var choice: Int = readln().toInt()
        if (choice == 1) {
            user.death()
            println("Вы проиграли!")
            continue
        } else if (choice == 2) {
            println("Вас атакует Орк!")
            ork.Attack(user, ork)
        } else if (choice == 3) {
            println("Вы прошли дальше!")
        } else {
            println("Такой двери нет, вы ушли")
            break
        }
        println("================")
        println("Задание 2")
        println("================")
        println("Необходимо ответить на вопрос 'в скольких месяцах 28 дней?'")
        val answer: Int = readln().toInt()
        if (answer == 12) {
            println("Вы прошли!")
        } else {
            println("Неверно! На вас напал Орк.")
            ork.Attack(user, ork)
        }
        println("================")
        println("Задание 3")
        println("================")
        println("Вам нужно сразиться с Боссом")
        dragon.Attack(user, dragon)
        if (user.hp > 0) {
            println("Вы выжили! Поздравляю!")
            println("Вы нашли сокровище!")
        } else {
            println("Вы проиграли!")
        }
        readLine()
    }
}