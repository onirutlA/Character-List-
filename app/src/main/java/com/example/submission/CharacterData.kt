package com.example.submission

object CharacterData {
    private val characterName = arrayOf(
        "The Boss",
        "Big Boss",
        "Shalashaska Revolver Ocelot",
        "Kazuhira Miller",
        "Solid Snake",
        "Quiet",
        "Skull Face",
        "Paz Ortega Andrade",
        "Chico",
        "Huey Emmerich"
    )
    private val characterDetail = arrayOf(
        "The Boss, also known as The Joy, The Mother of Special Forces, Mercury Lady and Voyevoda (Russian: Воевода, \"Warlord\"), was a renowned American soldier, founder and leader of the Cobra Unit, the biological mother of Ocelot, and mentor and mother figure to Naked Snake. In June 1944, during World War II, she led the Cobra Unit to victory at the Battle of Normandy. Together with Naked Snake, she developed the technique of CQC.",
        "Big Boss, real name John, also known as Jack, and formerly known as Naked Snake, Vic Boss,[4][5][6] Ishmael, Saladin, or simply Snake, was a renowned special forces operative and mercenary commander. He founded U.S. Army Special Forces Unit FOXHOUND, along with the mercenary company Militaires Sans Frontières, and was one of the founding members of the Patriots. Big Boss later established the military states of Outer Heaven and Zanzibar Land as bases for his companies, in order to realize his ambitions of creating a nation for soldiers. Considered by some as \"The Greatest Warrior of the 20th Century,\" he earned such monikers as \"the Legendary Soldier\" and \"the Legendary Mercenary,\" feared in combat by both friend and foe as a hero and a madman.",
        "Revolver Ocelot, real name Adamska (Russian: Адамска) or simply Adam (Russian: Адам), and also known as ADAM, Shalashaska (Russian: Шалашаска), or most commonly Ocelot (Russian: Оцелот), was a Russian-American operative of FOXHOUND and an agent of the Patriots. A master of interrogation and a formidable gunfighter, he was often referred to as a \"ricochet genius\" in regards to his gun fighting skills. A fanatic, he was known for his affinity towards Spaghetti Westerns, as evidenced by his choice of weapon and his clothing, duster and spurs, the traditional garb of cowboys. His weapon of choice was the Colt Single Action Army Revolver, which he regarded as \"the greatest handgun ever made.\" Throughout his career, Ocelot became personally acquainted with all five men codenamed Snake: a friendly rival to Big Boss (aka Naked Snake), the right hand man for Liquid Snake and Solidus Snake, one of Venom Snake's top advisers, and a nemesis to Solid Snake. He was the son of The Sorrow, and the legendary soldier The Boss, given birth to on the battlefield. Specializing in infiltration of a different nature than Solid Snake and Big Boss, Ocelot often acted as a triple agent, to serve multiple interests in the same situation.\n",
        "Kazuhira Miller (カズヒラ・ミラー Kazuhira Mirā?), also known as McDonell Benedict Miller and Master Miller, was the subcommander of both the Militaires Sans Frontières and Diamond Dogs, and later, the survival trainer of FOXHOUND. He was well-read and possessed a vast array of scientific knowledge.",
        "Solid Snake, real name David, also known as Old Snake, and briefly known as Iroquois Pliskin, or simply Snake, was a former spy, special operations soldier, and mercenary. Possessing an IQ of 180 and fluent in six languages, he was known as \"the Man Who Makes the Impossible Possible\" and his exploits made him into a living legend among the military black ops. A product of the Les Enfants Terribles project, Snake was a clone of world renowned soldier Big Boss, along with his brothers Liquid Snake and Solidus Snake. Initially a Green Beret, Snake was later inducted into High-Tech Special Forces Unit FOXHOUND in the mid 1990s while it was commanded by Big Boss. Repeatedly tasked with disarming and destroying the latest incarnation of Metal Gear, a bipedal nuclear weapon-armed tank, Snake would thrice avert potential nuclear catastrophe, becoming a famed war hero.",
        "Quiet, known to the Soviet forces as Tixij (Russian: Тихий, \"Quiet\"), was a female assassin during the 1980s. Originally an assassin for XOF, Quiet later defected to Diamond Dogs after being defeated by Venom Snake. Quiet wore a minimal amount of clothing at all times because she could only drink or breathe through her skin following parasite-treatment due to the serious injuries she had sustained while trying to kill Big Boss during the hospital raid; wearing too much clothing would lead to suffocation.",
        "Skull Face was the heavily scarred commander of the paramilitary unit XOF. He secretly commanded XOF from the 1960s up until his death in 1984, at first acting as a covert ally of Naked Snake during the Virtuous Mission and Operation Snake Eater, and later as Cipher's elite strike force until he finally took control of the organization away from Zero. Skull Face also created the Parasite Unit, a group of parasite-enhanced super soldiers that would act as his chief enforcers and high-level operatives for XOF during the 1980s. He suffered extensive injuries in his youth which caused his characteristic facial scars, burns, and discolorations (most notably a Glasgow smile).",
        "Paz Ortega Andrade, real name Pacifica Ocean, was a Cipher agent who infiltrated the Militaires Sans Frontières during the Peace Walker Incident in 1974.Pacifica Ocean was raised in the United States from a very young age.[3] She was taken in by Cipher after becoming an orphan, and felt that she owed him her life. However, her loyalty was partially born out of fear, as she believed that disobeying Cipher would result in \"a fate far worse than death\". She was also the only agent that had actually met Cipher face-to-face and received orders from him directly, in this case, to contact Big Boss",
        "Ricardo Valenciano Libre, better known as Chico (Spanish: \"Boy\"), was a child soldier of the Sandinista National Liberation Front (FSLN), operating in Costa Rica in the early 1970s. He was the younger brother of FSLN comandante Amanda Valenciano Libre. Because the Sandinistas had a hard time finding enough food in the jungle, Chico suffered from malnourishment, which made him shorter than kids of his age. Chico and Amanda called their father \"mi viejo\" (Spanish: \"my old man\").",
        "Dr. \"Huey\" Emmerich was a mechanical engineer responsible for developing bipedal locomotion technology for the Peace Walker Project in 1974 and later served as the chief engineer of Metal Gear Sahelanthropus in 1984. He was the biological father of Hal \"Otacon\" Emmerich and the stepfather of Emma \"E.E.\" Emmerich."
    )
    private val characterImage = intArrayOf(
        R.drawable.the_boss,
        R.drawable.big_boss,
        R.drawable.ocelot,
        R.drawable.kaz,
        R.drawable.solid_snake,
        R.drawable.quiet,
        R.drawable.skull_face,
        R.drawable.paz,
        R.drawable.chico,
        R.drawable.huey
    )
    val listCharacterData : ArrayList<Character>
    get(){
        val list = arrayListOf<Character>()
        for (position in characterName.indices){
            val character = Character()
            character.name = characterName[position]
            character.detail = characterDetail[position]
            character.image = characterImage[position]
            list.add(character)
        }
        return list
    }
}