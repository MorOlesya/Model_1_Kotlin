class Enemy {
    var name : String = ""
    var level : Int = 0
    var hp : Int = 0
    var attack : Int = 0
    var type: String = ""

    fun createEnemy(name : String, level : Int, hp : Int, attack : Int, type : String) {
        this.name = name
        this.level = level
        this.hp = hp
        this.attack = attack
        this.type = type
    }

    fun Info(){
        println("Имя: $name")
        println("Уровень: $level")
        println("Здоровье: $hp")
        println("Урон: $attack")
        println("Тип: $type")
    }

    fun CheckEnemyHP(){
        if (hp <= 0){
            println("Враг мёртв!")
        }
    }

    fun EnemyTakeDamage(hero: Hero){
        println("Персонаж ${name} атакован ${hero.name}")
        var damage: Int = hero.attack
        if (hero.mana > 0) {
            if (hero.type == type){
                damage = (hero.attack + (hero.attack.toDouble() * hero.mana / 200).toInt())
            } else {
                damage = (hero.attack + (hero.attack.toDouble() * hero.mana / 100).toInt())
            }
        }
        hp -= damage
        println("Урон: $damage")
        println("Осталось ${hp} здоровья")
        CheckEnemyHP()
    }

    fun Attack(hero: Hero, enemy: Enemy){
        hero.HeroTakeDamage(enemy)
    }
}