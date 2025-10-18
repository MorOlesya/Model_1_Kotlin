class Hero {
    var name : String = ""
    var level : Int = 0
    var hp : Int = 0
    var attack : Int = 0
    var mana : Int = 0
    var weapon: String = ""
    var type: String = ""
    var shield: Boolean = false

    fun createHero(name : String, level : Int, hp : Int, attack : Int, mana: Int, weapon : String, type : String) {
        this.name = name
        this.level = level
        this.hp = hp
        this.attack = attack
        this.mana = mana
        this.weapon = weapon
        this.type = type
    }

    fun Info(){
        println("Имя: $name")
        println("Уровень: $level")
        println("Здоровье: $hp")
        println("Урон: $attack")
        println("Мана: $mana")
        println("Оружие: $weapon")
        println("Тип: $type")
    }

    fun CastSpell(){
        println("${name} кастует заклинание!")
        if (mana > 15) {
            mana -= 15
            println("Персонаж применил заклинание!")

        } else {
            println("Не хватает маны!")
        }
    }

    fun CheckHeroHP(){
        if (hp <= 0){
            println("Персонаж мёртв!")
            hp = 0
        }
    }

    fun HeroTakeDamage(enemy: Enemy){
        println("Персонаж ${name} атакован ${enemy.name}")
        var damage: Int = enemy.attack
        if (shield == true) {
            if (type == enemy.type){
                damage = (enemy.attack - (enemy.attack.toDouble() * 0.3).toInt())
            } else {
                damage = (enemy.attack - (enemy.attack.toDouble() * 0.2).toInt())
            }
        }
        hp -= damage
        println("Урон: $damage")
        println("Осталось ${hp} здоровья")
        CheckHeroHP()
    }

    fun ReviveCharacter(){
        if (hp == 0) {
            println("Воскрещение персонажа...")
            println("Восстановления здоровья...")
            println("Перснаж жив!")
            hp = 50
            println("Восстановлено здоровья на 50 единиц")
        }
    }

    fun Attack(hero: Hero, enemy: Enemy){
        enemy.EnemyTakeDamage(hero)
    }

    fun death(){
        this.hp = 0
    }
}