class Character {
    var heros = mutableListOf<Hero>()
    var enemies = mutableListOf<Enemy>()

    fun createFriendlyCharacter(hero: Hero){
        heros.add(hero)
        println("Герой добавлен")
    }

    fun printFriendlyCharacters(){
        for (hero in heros){
            println("Герой: ${hero.name}")
        }
    }

    fun createEnemyCharacter(enemy: Enemy){
        enemies.add(enemy)
        println("Враг добавлен")
    }

    fun printEnemyCharacters(){
        for (enemy in enemies){
            println("Враг: ${enemy.name}")
        }
    }


}