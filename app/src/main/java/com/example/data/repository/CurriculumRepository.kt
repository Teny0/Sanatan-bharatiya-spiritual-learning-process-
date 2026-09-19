package com.example.data.repository

import com.example.data.models.*

object CurriculumRepository {

    // --- PHASE 1: PRINCIPLES FROM SCRIPTURES (Universal, Secular) ---
    val scriptureExtracts = listOf(
        ScriptureOrigin.VEDAS to listOf(
            "Love of learning (Vidya Anuraga) — Cultivating intrinsic wonder rather than performance anxiety.",
            "Observation of nature (Rta) — Attunement to biological rhythms, seasons, and ecological symbiosis.",
            "Rhythm & memory (Chhandas & Shruti) — Auditory pattern recognition and phonemic plasticity.",
            "Gratitude (Kritajnata) — Daily thankfulness to sunlight, plants, water, and parents.",
            "Respect for knowledge (Saraswati principle) — Treating books and instruments with care.",
            "Curiosity about the cosmos (Brahmanda) — Constant questioning: 'Where did the clouds come from?'"
        ),
        ScriptureOrigin.UPANISHADS to listOf(
            "Self-awareness (Sva-bodha) — The ability to perceive one's own thoughts and physiological cues.",
            "Reflection (Manana) — Quiet space at twilight to integrate what was experienced.",
            "Courageous questioning (Prashna) — Praising a child for asking hard questions, like Nachiketa.",
            "Deep listening (Shravana) — Attentive ear without interrupting, hearing nuances in nature.",
            "Inner calm (Shanti) — Realizing stillness is always available behind active thoughts.",
            "Identity beyond temporary emotions (Sakshi Bhava) — 'I feel angry right now, but I AM not anger.'"
        ),
        ScriptureOrigin.RAMAYANA to listOf(
            "Integrity (Satya-vrata) — Aligning words with actions; honoring gentle promises.",
            "Keeping promises (Pratigya) — Developing trust and dependable accountability.",
            "Courage in difficulty (Dhairya) — Stepping forward even when feeling small, like the squirrel building the bridge.",
            "Duty & responsibility (Dharma) — Contributing to the family harmony and tidiness.",
            "Family responsibility (Kula-hita) — Caring for siblings and respecting elder wisdom.",
            "Loyalty & friendship (Mitrata) — Standing by friends in play and challenge.",
            "Leadership by example (Charitra) — Showing how to act through kind actions rather than loud demands."
        ),
        ScriptureOrigin.MAHABHARATA to listOf(
            "Ethical decision making (Viveka) — Discerning between what feels easy vs. what is truly right.",
            "Perspective taking (Para-drishti) — Stepping into another person's shoes during conflict.",
            "Handling conflict constructively (Sandhi) — Resolving disagreements without hostility or deceit.",
            "Strategic thinking (Yukti) — Thinking two steps ahead in block building and game strategy.",
            "Emotional regulation (Sama) — Not allowing excitement or rage to hijack clear thinking.",
            "Consequences of actions (Karma) — Cause-and-effect understanding: every choice ripples outwards."
        ),
        ScriptureOrigin.BHAGAVAD_GITA to listOf(
            "Focus on effort over outcome (Karmanye Vadhitakaraste) — Loving the process, not chasing gold stars.",
            "Growth mindset (Abhyasa) — Dedication to continuous practice; mistakes are merely data.",
            "Emotional stability (Samatvam) — Remaining centered whether we win or lose a race.",
            "Self-discipline (Dama) — Willpower to clean up toys before starting a new adventure.",
            "Purposeful action (Kushalatvam) — Doing even small chores with artistic pride and devotion.",
            "Resilience under pressure (Titiksha) — Bouncing back with humor when a tower collapses."
        ),
        ScriptureOrigin.PURANAS to listOf(
            "Story-based moral learning (Akhyana) — Embedding wisdom within exciting visual narratives.",
            "Active imagination (Kalpana) — Building imaginary castles and mythological realms.",
            "Sense of wonder (Vismaya) — Experiencing awe looking at starry night skies and river stones.",
            "Symbolic thinking (Prateeka) — Understanding that animals and seasons teach life lessons.",
            "Community values (Loka-sangraha) — Sharing feasts, caring for neighborhood animals.",
            "The Hero's Journey (Vira-yatra) — Overcoming obstacles through courage, wit, and kindness."
        )
    )

    // --- PHASE 2: THE 6 HUMAN PILLARS ---
    val pillarsSummary = listOf(
        HumanPillar.BODY to listOf(
            "Strength: Core stability and functional climbing power",
            "Balance: Vestibular resilience through beam walks & tree hopping",
            "Coordination: Bilateral motor integration and rhythm jumping",
            "Flexibility: Gentle yogic animal stretches (Cat, Cobra, Butterfly)",
            "Endurance: Joyful playground and nature trail stamina",
            "Healthy Habits: Cheerful hydration, wholesome meal gratitude, circadian sleep"
        ),
        HumanPillar.MIND to listOf(
            "Attention Control: Trataka/gentle gazing and sustained sound tracking",
            "Memory: Shruti chant-echo games, spatial recall, and visual hide-and-seek",
            "Reasoning: Cause-and-effect questioning ('Why did the ice melt?')",
            "Problem Solving: Loose-parts architectural puzzles and trail navigation",
            "Creativity: Divergent play using clay, leaves, sticks, and rhythm sticks",
            "Pattern Recognition: Identifying recurring motifs in music, nature, and numbers"
        ),
        HumanPillar.EMOTIONS to listOf(
            "Self-Awareness: Checking bodily sensations (fluttering heart, warm cheeks)",
            "Empathy: Reading facial cues and offering comforting gestures",
            "Confidence: Grounded sense of agency ('I can learn this with practice')",
            "Gratitude: Noticing unseen contributors (baker, rain, trees, family)",
            "Resilience: Bouncing back from spills and frustration with deep belly breaths",
            "Emotional Vocabulary: Nuanced naming (frustrated, curious, overwhelmed, joyful)"
        ),
        HumanPillar.CHARACTER to listOf(
            "Honesty: Speaking the truth gently without fear of harsh punishment",
            "Courage: Trying new challenges despite initial butterflies in tummy",
            "Responsibility: Tending to toys, plants, shoes, and personal gear",
            "Patience: Waiting for a sapling to sprout or a turn on the swing",
            "Persistence: Sticking with a puzzle when the first three tries fail",
            "Kindness: Spontaneous acts of sharing and welcoming playmates"
        ),
        HumanPillar.SOCIAL to listOf(
            "Communication: Expressing wishes clearly with eye contact and polite cues",
            "Cooperation: Building cooperative forts where everyone has a mission",
            "Leadership: Guiding by listening, helping smaller friends, and taking turns",
            "Conflict Resolution: Using talking-stones and peaceful restitution",
            "Listening: Shravana ear training—hearing the bird before seeing it",
            "Service (Seva): Feeding birds, watering home garden, helping set dinner mats"
        ),
        HumanPillar.TWENTY_FIRST_CENTURY to listOf(
            "Adaptability: Embracing rainy days with new indoor boat races",
            "Systems Thinking: Tracing an apple from tree to honeybee, soil, and rain",
            "Entrepreneurial Spirit: Inventing games and roleplaying community markets",
            "Resource Awareness: Appreciating natural abundance and avoiding food waste",
            "Media Literacy: Distinguishing real human voice & face from screen cartoons",
            "Digital Wisdom: Treating screens as rare tools rather than constant babysitters",
            "Learning How to Learn: Metacognition—'What strategy helped me solve this?'"
        )
    )

    // --- PHASE 3: AGE-WISE LEARNING JOURNEYS (7 STAGES) ---
    val stagePlans: Map<AgeStage, StageDevelopmentPlan> = mapOf(
        AgeStage.STAGE_0_1 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_0_1,
            brainGoals = listOf(
                "Myelination of sensory pathways via multi-textured natural fabrics and skin-to-skin touch",
                "Phonemic tuning through gentle lulling lullabies and rhythmic metric syllables (Vedic meters)",
                "Visual tracking and depth perception through high-contrast natural patterns"
            ),
            emotionalGoals = listOf(
                "Establish secure attachment through attunement and rapid soothing response",
                "Calm nervous system through co-regulation and steady parental heart rhythms",
                "Delight in mirror reflection and reciprocal smiles"
            ),
            physicalGoals = listOf(
                "Tummy time trunk strengthening and neck head control",
                "Cross-lateral crawling pattern developing corpus callosum",
                "Pincer grasp exploration of safe wooden rings and smooth river stones"
            ),
            socialGoals = listOf(
                "Proto-conversations: taking turns vocalizing coos and babble sounds",
                "Eye gaze locking during nursery songs",
                "Gentle hand waves and responsive smiling with grandparents"
            ),
            characterGoals = listOf(
                "Primal Trust (Shraddha in environment): Feeling the world is safe and nourishing",
                "Curiosity: Reaching outward toward sunlight and dangling leaves"
            ),
            dailyActivities = listOf(
                ChildActivity("act_01_1", "Sunrise Window Greeting (Surya Sparsha)", HumanPillar.BODY, 5, "Morning",
                    "Hold infant near morning sunlight, singing gentle soft hums and stretching legs like a playful frog.",
                    "Gentle baby cycling legs with sensory light exposure.",
                    "Talk softly about warmth, touch toes to natural grass if weather allows.",
                    "Surya Namaskara baby gentle rhythm", "Circadian melatonin reset and vitamin D activation"),
                ChildActivity("act_01_2", "Rattle & Drum Echo (Shravana)", HumanPillar.MIND, 5, "Afternoon",
                    "Shake a soft dried pulse seed shaker on left side, wait for head turn, then softly on right side.",
                    "Bilateral sound tracking game.",
                    "Keep sound gentle, smile warmly when infant makes eye contact with the shaker.",
                    "Vedic meter rhythmic pulse", "Auditory cortex spatial mapping"),
                ChildActivity("act_01_3", "Heartbeat Lullaby (Shanti Lori)", HumanPillar.EMOTIONS, 10, "Evening",
                    "Chest-to-chest rocking with rhythmic low humming chant in 4-count breathing.",
                    "Co-regulatory skin rocking.",
                    "Deep slow parental exhalations transfer parasympathetic calm to infant.",
                    "Sama Veda melodic soothing", "Vagal tone optimization and oxytocin cascade")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_01_w1", "Barefoot Grass & Earth Bath", HumanPillar.BODY, 15, "Weekly",
                    "Rest bare infant feet on cool morning lawn, soft sand, or textured cloth.",
                    "Tactile sensory integration.",
                    "Narrate every sensation: 'Tickle tickle cool clover! Did you feel the dew?'",
                    "Prithvi (Earth element) communion", "Proprioceptive and cutaneous nerve density development")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_01_m1", "Forest Canopy Gaze", HumanPillar.MIND, 30, "Monthly",
                    "Stroll under dappled shade of a large banyan, oak, or mango tree. Look up at swaying leaves.",
                    "Visual fractal flow.",
                    "Point out birds fluttering and wind whisper.",
                    "Aranya (Forest sanctuary) awe", "Visual cortex relaxation via natural fractals")
            ),
            parentCoachingGuidance = "Your calm nervous system is the baby's first scripture. Don't worry about structured lessons; talk, sing, narrate your day, carry them close, and keep screens completely away."
        ),

        AgeStage.STAGE_1_2 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_1_2,
            brainGoals = listOf(
                "Cerebellar motor coordination through balance recovery and squatting",
                "Receptive vocabulary expansion to 100+ nouns and action words",
                "Object permanence and spatial exploration"
            ),
            emotionalGoals = listOf(
                "Safe harbor exploration: checking back to parent's eyes for reassurance",
                "Navigating initial toddler frustration with loving naming: 'That fell! You are angry!'",
                "Sensory soothing through water play and rhythmic swinging"
            ),
            physicalGoals = listOf(
                "Stable bipedal walking across uneven terrain (grass, mounds, thresholds)",
                "Carrying weighted objects (two-handed water cup, small wooden log)",
                "Climbing low cushions or stairs on hands and knees"
            ),
            socialGoals = listOf(
                "Joint attention: pointing at an airplane or dog and sharing gaze",
                "Parallel play next to peers with shared blocks",
                "Waving, clapping, and offering a toy to parent"
            ),
            characterGoals = listOf(
                "Persistence: Trying to fit a round peg in a hole repeatedly",
                "Gentleness: Petting a sleeping cat or touching a flower petal with one finger"
            ),
            dailyActivities = listOf(
                ChildActivity("act_12_1", "Bear Crawl & Monkey March", HumanPillar.BODY, 7, "Morning",
                    "Hands and feet on floor, crawl across the rug roaring softly like a forest bear, then hop like a monkey.",
                    "Animal locomotion game.",
                    "Mirror the child's movement and cheer when they balance on one foot.",
                    "Pashu-mudra animal play", "Vestibular stimulation and core abdominal development"),
                ChildActivity("act_12_2", "Pebble Drop in Brass Bowl", HumanPillar.MIND, 6, "Afternoon",
                    "Pick up clean large smooth stones or walnuts and drop them one by one into a ringing bowl.",
                    "Precision grasp and auditory feedback game.",
                    "Count together melodically 'Ek, Do, Teen' (One, Two, Three).",
                    "Nada (sound) cause and effect", "Grip strength and auditory consequence mapping"),
                ChildActivity("act_12_3", "Bedtime Candle Blow / Flower Sniff", HumanPillar.EMOTIONS, 5, "Evening",
                    "Pretend to smell a sweet rose (deep sniff in through nose), then blow out an imaginary birthday candle (long soft breath out).",
                    "Pranayama breath play for toddlers.",
                    "Do it 4 times together before reading a quiet board book.",
                    "Prana awareness", "Prefrontal cortex down-regulation of bedtime fight-or-flight")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_12_w1", "Puddle Splashing & Mud Stomp", HumanPillar.BODY, 15, "Weekly",
                    "Dress in washable gear and stomp joyfully in clean puddles, noting ripples and reflections.",
                    "Kinesthetic joyful exploration.",
                    "Allow getting messy; it builds sensory resilience and immunity.",
                    "Jala (Water) joyous play", "Microbiome diversification and tactile modulation")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_12_m1", "Park Bird Feeding Quest", HumanPillar.SOCIAL, 30, "Monthly",
                    "Scatter birdseed in the park, sit very still on a bench holding hands, waiting for sparrows to feast.",
                    "Impulse control and stillness mission.",
                    "Whisper: 'Shh, let us be quiet like statues so our feathered guests feel welcome.'",
                    "Bhuta Yajna (Respect for creature kin)", "Inhibitory control and empathy towards wildlife")
            ),
            parentCoachingGuidance = "Toddlers are natural scientists testing gravity, cause, and boundaries. Replace 'No, don't touch!' with 'Let's touch gently with one finger.' Guide their eager hands toward safe exploration."
        ),

        AgeStage.STAGE_2_3 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_2_3,
            brainGoals = listOf(
                "Language explosion: two-to-three word sentences and descriptive adjectives",
                "Symbolic representation: turning a cardboard box into a flying chariot or boat",
                "Executive function: following two-step instructions ('Pick up block, put in basket')"
            ),
            emotionalGoals = listOf(
                "Tantrum recovery through the 'Emotional Weather' metaphor ('A big thundercloud came, let's wait for sunshine')",
                "Expressing pride in small accomplishments without needing external candy bribes",
                "Identifying basic emotion faces: Happy, Sad, Mad, Surprised"
            ),
            physicalGoals = listOf(
                "Jumping with two feet off the floor",
                "Balancing on one foot for 3 seconds like a crane",
                "Pouring water between two small metal pitchers without big spills"
            ),
            socialGoals = listOf(
                "Taking turns for brief intervals with an hourglass sand timer",
                "Helping put away playthings into color-coded baskets",
                "Offering comfort (a hug or blanket) when a sibling looks sad"
            ),
            characterGoals = listOf(
                "Truthfulness in simple things ('Did the cup spill? Yes, let's wipe it together!')",
                "Courage to explore unfamiliar room corners with parent nearby"
            ),
            dailyActivities = listOf(
                ChildActivity("act_23_1", "Crane on One Leg (Baka Asana Play)", HumanPillar.BODY, 8, "Morning",
                    "Stand tall like a wise crane bird by a river. Lift one foot, spread wings wide, count to 3, then swap legs.",
                    "Balance and core stabilizer game.",
                    "Make it silly: when the crane drops a leg, it takes a sip of water!",
                    "Yoga asana animal postures", "Cerebellar balance and bilateral vestibular integration"),
                ChildActivity("act_23_2", "Color & Texture Treasure Hunt", HumanPillar.MIND, 10, "Afternoon",
                    "Find 3 green things, 2 rough things (bark, pinecone), and 1 smooth thing in the living room or yard.",
                    "Categorization and sensory discernment.",
                    "Celebrate each find with a gentle high-five and tactile discussion.",
                    "Indriya-nigraha (Refining sensory perception)", "Cognitive flexibility and working memory"),
                ChildActivity("act_23_3", "Teddy Bear Emotional Check-in", HumanPillar.EMOTIONS, 6, "Evening",
                    "Hold teddy bear. Ask child: 'How was Teddy feeling today? Was Teddy happy at the playground or tired?'",
                    "Third-person projection for emotional vocabulary.",
                    "Children project feelings onto stuffed animals when direct questions feel overwhelming.",
                    "Mitra (Compassionate companion)", "Limbic system emotional regulation and narrative cohesion")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_23_w1", "Dough Sculpting & Clay Pinching", HumanPillar.TWENTY_FIRST_CENTURY, 20, "Weekly",
                    "Knead whole wheat flour dough or natural clay, sculpting birds, balls, and flat rotis.",
                    "Sensory molding and fine motor dexterity.",
                    "Let them experiment freely without demanding 'photorealistic' results.",
                    "Kala (Craftsmanship and tactile creativity)", "Bilateral hand integration and spatial imagination")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_23_m1", "Neighborhood Helper Walk", HumanPillar.CHARACTER, 35, "Monthly",
                    "Walk with small paper bag, picking up clean fallen twigs, greeting the letter carrier, waving to neighbors.",
                    "Community connectedness quest.",
                    "Say 'Good morning!' with smiling eyes and Namaste or cheerful wave.",
                    "Seva & Grama-hita (Village connection)", "Prosocial orientation and community belonging")
            ),
            parentCoachingGuidance = "The 'terrible twos' are actually the 'terrific discovery years.' Tantrums happen because emotions are bigger than their vocabulary. Give them words: 'Your tower fell and you feel frustrated. Let's breathe like a lion together.'"
        ),

        AgeStage.STAGE_3_4 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_3_4,
            brainGoals = listOf(
                "Theory of mind emergence: realizing others have different thoughts and feelings",
                "Narrative comprehension: recounting what happened at the park in sequential order",
                "Fine motor precision: threading large beads and holding crayons with tripod grasp"
            ),
            emotionalGoals = listOf(
                "Delaying gratification for 5 minutes during fun collaborative kitchen tasks",
                "Recognizing inner volcano bubbling before screaming and using 'Cool Down Breath'",
                "Developing genuine empathy when friends scrape a knee"
            ),
            physicalGoals = listOf(
                "Riding a 3-wheel scooter or balance bike with confidence",
                "Catching a large thrown beanbag with two hands",
                "Somersaults and rolling safely on grass cushions"
            ),
            socialGoals = listOf(
                "Cooperative play: building a shared castle with specific roles ('You get blocks, I build walls')",
                "Polite negotiation: 'Can I have the blue truck when you finish driving to the farm?'",
                "Participating in family cleanup songs cheerfully"
            ),
            characterGoals = listOf(
                "Keeping promises: 'I promise to wash hands before sitting at the table'",
                "Protecting the vulnerable: gentle handling of bugs, seedlings, and babies"
            ),
            dailyActivities = listOf(
                ChildActivity("act_34_1", "Lion's Roar & Turtle Shell", HumanPillar.BODY, 8, "Morning",
                    "First kneel, stick out tongue, open eyes wide and roar silently or loudly like Simha (Lion). Then tuck inside turtle shell, completely still for 10 seconds.",
                    "Contraction and relaxation contrast training.",
                    "Guide them to notice how the body feels loose and warm after the lion roar.",
                    "Simhasana & Kurmasana", "Facial muscle release, vocal confidence, and proprioceptive reset"),
                ChildActivity("act_34_2", "Three-Stone Story Weave", HumanPillar.MIND, 10, "Afternoon",
                    "Collect three objects (leaf, spoon, pebble). Parent and child invent a hero adventure incorporating all three.",
                    "Creative association and verbal fluency.",
                    "Start with: 'Once upon a time, a little rabbit found a shiny spoon...'",
                    "Kathana (Oral storytelling traditions)", "Divergent thinking and associative cortex activation"),
                ChildActivity("act_34_3", "Gratitude Star Jar", HumanPillar.EMOTIONS, 6, "Evening",
                    "Drop a dry bean or flower petal into a glass jar for 3 specific things we appreciated today.",
                    "Concrete ritual of gratitude.",
                    "Encourage specifics: not just 'toys', but 'the warm yellow blanket' or 'the funny dog we saw'.",
                    "Kritajnata (Vedic gratitude)", "Strengthening anterior cingulate cortex and sleep serenity")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_34_w1", "Blindfold Sound Detective", HumanPillar.MIND, 15, "Weekly",
                    "Child closes eyes or wears soft blindfold. Parent taps spoon on wood, crinkles paper, or whispers. Child guesses sound.",
                    "Auditory discrimination and internal focus.",
                    "Reverse roles! Let child make sounds for parent to guess.",
                    "Shravana focus mastery", "Auditory acuity and sensory de-escalation")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_34_m1", "Seed to Sprout Garden Project", HumanPillar.TWENTY_FIRST_CENTURY, 40, "Monthly",
                    "Plant coriander or bean seeds in soil pot. Water daily, measure sprout with a wooden ruler over 3 weeks.",
                    "Biological systems thinking and delayed gratification.",
                    "Praise patience when soil looks empty during germination.",
                    "Prakriti cycle stewardship", "Long-term causality and ecological stewardship")
            ),
            parentCoachingGuidance = "Children this age love rituals and storytelling. When correcting behavior, avoid shaming ('You are bad'). Frame it through character: 'In our home, we are gentle protectors. How can your hands be helpful right now?'"
        ),

        AgeStage.STAGE_4_5 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_4_5,
            brainGoals = listOf(
                "Hypothesis testing: 'What will happen if we add water to sand? Will it stand higher?'",
                "Rhythmic verse memorization: chanting short Sanskrit/folk verses that train working memory",
                "Spatial geometry: building complex symmetric structures with geometric tiles"
            ),
            emotionalGoals = listOf(
                "Self-regulation under frustration: taking 3 balloon breaths when a drawing tears",
                "Courage in new social situations: introducing oneself to a new child at the park",
                "Identifying the difference between jealousy and inspiration"
            ),
            physicalGoals = listOf(
                "Skipping with alternating feet in rhythmic cadence",
                "Hopping on one foot across a chalk line 5 times",
                "Cutting accurately along straight and curved lines with safety scissors"
            ),
            socialGoals = listOf(
                "Active conflict resolution: 'Let us use rock-paper-scissors or flip a coin'",
                "Taking pride in family service (arranging napkins, feeding the cat)",
                "Listening to a peer's entire story without jumping in to interrupt"
            ),
            characterGoals = listOf(
                "Focus on effort over outcome: 'Look how much effort you put into balancing those 10 blocks!'",
                "Honesty even when afraid of making a mistake"
            ),
            dailyActivities = listOf(
                ChildActivity("act_45_1", "Sunbeam Obstacle Course", HumanPillar.BODY, 10, "Morning",
                    "Lay cushions, chalk lines, and a low table. Crawl under, hop over, balance walk on line, finish with a victory jump.",
                    "Agility, spatial awareness, and motor planning.",
                    "Time them with a fun count, focusing on smooth movements rather than rush.",
                    "Vira (Hero warrior) physical literacy", "Gross motor coordination and prefrontal motor sequencing"),
                ChildActivity("act_45_2", "The Squirrel's Bridge (Ramayana Challenge)", HumanPillar.CHARACTER, 12, "Afternoon",
                    "Read the story of the tiny squirrel carrying grains of sand to help Rama build the great ocean bridge. Child does a tiny helpful task.",
                    "Value of small consistent effort.",
                    "Discuss: 'Even when we feel tiny, do our small efforts matter?'",
                    "Ramayana seva principle", "Intrinsic self-worth and prosocial contribution"),
                ChildActivity("act_45_3", "Night Sky Stars & Breath (Trataka)", HumanPillar.MIND, 7, "Evening",
                    "Look at a single bright star or soft amber candle for 30 seconds without blinking, then close eyes and see the warm glow inside.",
                    "Trataka focus and retinal afterimage observation.",
                    "End with: 'You have a steady inner light just like that star.'",
                    "Trataka (Yogic visual focus)", "Dorsolateral prefrontal cortex concentration booster")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_45_w1", "Family Talking Stick Council", HumanPillar.SOCIAL, 20, "Weekly",
                    "Hold a carved wooden stick or special smooth stone. Whoever holds the stick speaks about their week; everyone else listens with ears and eyes.",
                    "Democratic conversation and deep listening.",
                    "Teach waiting without interrupting: 'Your ears are gifts for your brother right now.'",
                    "Panchayat consensus culture", "Inhibitory control and perspective-taking")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_45_m1", "Farmer's Market Tasting Quest", HumanPillar.TWENTY_FIRST_CENTURY, 45, "Monthly",
                    "Visit open market or farm. Talk to growers: 'Where do these carrots drink water?' Pick up purple carrots or strange squashes.",
                    "Origin of food and economic appreciation.",
                    "Count coins, greet the farmer with eye contact, carry cloth bags.",
                    "Anna Daata (Honoring food providers)", "Systems literacy and social confidence")
            ),
            parentCoachingGuidance = "Praise effort, not innate intelligence. Instead of saying 'You are so smart at math,' say 'I noticed how you kept trying different pieces until the puzzle locked into place! That is true focus.'"
        ),

        AgeStage.STAGE_5_6 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_5_6,
            brainGoals = listOf(
                "Classification and taxonomies: grouping plants by leaf shapes, animals by footprints",
                "Mental rotation of shapes and early map reading (drawing home to park path)",
                "Phonological awareness: breaking spoken words into individual phonemes and rhymes"
            ),
            emotionalGoals = listOf(
                "Navigating peer rejection: 'Arjun wanted to play tag alone today. That's okay, I can build with sand or invite Meera'",
                "Standing up against unfairness: using strong voice 'Stop, I don't like that!'",
                "Emotional stability when a game is lost: shaking hands with the winner with dignity"
            ),
            physicalGoals = listOf(
                "Riding a two-wheeled pedal bicycle without training wheels",
                "Swimming strokes or floating on back with relaxed breath",
                "Tying simple shoelace knots and using child tools safely (screwdriver, hammer with supervision)"
            ),
            socialGoals = listOf(
                "Collaborative role-play with structured rules (playing hospital, space station, gurukula school)",
                "Comforting others who are crying without laughing or feeling uncomfortable",
                "Taking leadership: teaching a younger sibling or friend how to play a game"
            ),
            characterGoals = listOf(
                "Keeping secrets/surprises for birthdays without spoiling",
                "Self-discipline (Dama): putting tablet/toys away when the bell rings without tantrums"
            ),
            dailyActivities = listOf(
                ChildActivity("act_56_1", "Animal Flow & Core Challenge", HumanPillar.BODY, 12, "Morning",
                    "Flow smoothly: Downward Dog -> Cobra -> Frog Squat -> Tree Pose. Hold tree pose for 15 seconds each side without touching walls.",
                    "Dynamic balance and core stamina.",
                    "Challenge child: 'Can you breathe slowly while balancing?'",
                    "Surya Namaskara & Vrikshasana", "Postural stability, proprioception, and vestibular resilience"),
                ChildActivity("act_56_2", "Mahabharata Moral Dilemma Game", HumanPillar.CHARACTER, 12, "Afternoon",
                    "Present a gentle dilemma: 'Two birds want the same ripe berry on a branch. What are 3 ways they can solve this without fighting?'",
                    "Ethical reasoning and creative compromise.",
                    "Praise ingenious solutions: taking turns, splitting in half, finding a second bush.",
                    "Viveka (Discerning intelligence)", "Executive function, ethical calculus, and conflict agility"),
                ChildActivity("act_56_3", "Body Scan River Float", HumanPillar.EMOTIONS, 8, "Evening",
                    "Lie flat on back. Imagine a gentle warm river floating from toes, up to knees, belly, chest, face, relaxing every muscle like warm sunshine.",
                    "Yoga Nidra progressive relaxation for children.",
                    "Speak in slow, rhythmic, grounded cadence.",
                    "Yoga Nidra relaxation", "Autonomic nervous system soothing and deep REM preparation")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_56_w1", "Cardboard Box Inventor's Lab", HumanPillar.TWENTY_FIRST_CENTURY, 30, "Weekly",
                    "Give child cardboard boxes, string, tape, and scissors. Challenge: 'Design a vehicle that travels on land and water.'",
                    "Maker mindset and rapid prototyping.",
                    "Ask: 'What was your biggest problem, and how did you overcome it?'",
                    "Vishwakarma (The divine creator spirit)", "Spatial problem-solving and divergent engineering")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_56_m1", "Night Hike & Constellation Exploration", HumanPillar.MIND, 50, "Monthly",
                    "Walk in evening twilight with flashlights turned off. Look at Big Dipper (Saptarishi) and North Star (Dhruva).",
                    "Astronomy wonder and overcoming fear of the dark.",
                    "Tell the story of Prince Dhruva's unshakeable determination.",
                    "Saptarishi & Dhruva Nakshatra", "Awe, perspective shift, and intrinsic resilience")
            ),
            parentCoachingGuidance = "At 5-6, children develop a keen sense of justice ('That's not fair!'). Use real conflicts as classroom moments. Ask: 'What does fairness look like to both of you right now?'"
        ),

        AgeStage.STAGE_6_7 to StageDevelopmentPlan(
            ageStage = AgeStage.STAGE_6_7,
            brainGoals = listOf(
                "Systems thinking: understanding interconnected ecological networks (pollinators, plants, weather, humans)",
                "Logical deduction and strategic planning: playing chess or strategy board games",
                "Expressive literacy: writing and illustrating a 4-page personal comic or hero tale"
            ),
            emotionalGoals = listOf(
                "Internal locus of control: realizing moods are created within, not dictated by outside events",
                "Compassionate self-talk when failing a test or goal: 'I haven't mastered this YET'",
                "Public speaking courage: presenting a project to family or classroom with clear posture and eye contact"
            ),
            physicalGoals = listOf(
                "Climbing trees or climbing gym walls with planned hand-foot sequences",
                "Coordinated ball sports: dribbling, passing, jumping rope 20 consecutive turns",
                "Advanced agility and balance across narrow logs and rocky creeks"
            ),
            socialGoals = listOf(
                "Mentoring younger peers with patience and warmth",
                "Working in a group project where ideas clash, facilitating consensus",
                "Performing genuine community service without expecting gifts"
            ),
            characterGoals = listOf(
                "Integrity: Doing the right thing even when no parent is watching in the room",
                "Resilience under pressure (Bhagavad Gita's Titiksha): Staying composed when referees make a call they dislike"
            ),
            dailyActivities = listOf(
                ChildActivity("act_67_1", "Warrior Focus Sequence (Arjuna's Gaze)", HumanPillar.MIND, 12, "Morning",
                    "Warrior 1 & 2 posture. Fix gaze at a single target leaf across the room without letting eyes dart around for 45 seconds.",
                    "Sustained visual attention and bodily grit.",
                    "Tell the story of Arjuna who saw only the eye of the wooden bird, not the branch or clouds.",
                    "Ekagrata (One-pointed concentration)", "Frontoparietal attention network strengthening"),
                ChildActivity("act_67_2", "Mini-Business or Charity Trade Game", HumanPillar.TWENTY_FIRST_CENTURY, 15, "Afternoon",
                    "Set up a lemonade/herbal tea stand or bookmark shop for family. Calculate costs, make change, donate portion to bird sanctuary.",
                    "Financial awareness and community reciprocity.",
                    "Discuss: 'How does honest work benefit our whole community?'",
                    "Artha with Dharma (Ethical prosperity)", "Applied numeracy, negotiation, and service ethics"),
                ChildActivity("act_67_3", "Evening Socratic Reflection", HumanPillar.CHARACTER, 8, "Evening",
                    "Ask 3 deep questions: 'What was your favorite challenge today? When did you help someone? What will you do differently tomorrow?'",
                    "Socratic meta-cognition and moral self-appraisal.",
                    "Listen without judging or correcting their honest answers.",
                    "Atma-vichara (Self-inquiry of Upanishads)", "Prefrontal reflection and internal motivation calibration")
            ),
            weeklyActivities = listOf(
                ChildActivity("act_67_w1", "Creek or Wilderness Shelter Building", HumanPillar.BODY, 40, "Weekly",
                    "Using branches, fallen bark, and stones, construct a water-resistant shelter or miniature dam in a safe park stream.",
                    "Real-world physics, team problem-solving, and elemental resilience.",
                    "Discuss water flow, gravity, and load-bearing structures.",
                    "Vana-yatra (Forest exploration)", "Spatial engineering, grit, and physical literacy")
            ),
            monthlyAdventures = listOf(
                ChildActivity("act_67_m1", "Family Seva Kitchen Project", HumanPillar.SOCIAL, 60, "Monthly",
                    "Bake bread, wash fruit, and deliver warm meals to elderly neighbors or animal rescue shelter.",
                    "Practical selfless service.",
                    "Encourage the child to personally hand over the food package with a warm greeting.",
                    "Nishkama Karma (Selfless service of Gita)", "Prosocial altruism, oxytocin, and deep purpose")
            ),
            parentCoachingGuidance = "By age 7, transition from 'directing' to 'mentoring.' Ask guiding questions: 'What do you think is the best next step?' Let them experience the natural consequences of forgetting their jacket, and support them as they solve it."
        )
    )

    // --- PHASE 4: THE 7 MASTERY LEVELS OF THE GAMIFIED WORLD ---
    val masteryLevels = listOf(
        MasteryLevel(
            levelNumber = 1,
            title = "Explorer",
            ageRange = "0–1 Years",
            motto = "I open my eyes and touch the wonder of the world.",
            missions = listOf(
                LevelMission("m1_1", "Sunlight Greeting", "Mission", "Experience morning sun and soft breeze on bare skin for 5 days", "badge_sun", HumanPillar.BODY),
                LevelMission("m1_2", "Sound Detective", "Challenge", "Track subtle sounds from left to right 10 times", "badge_ear", HumanPillar.MIND),
                LevelMission("m1_3", "Warm Touch Haven", "Quest", "Establish deep reciprocal eye gaze and cooing dialogue with parents", "badge_heart", HumanPillar.EMOTIONS)
            ),
            badges = listOf(
                BadgeInfo("badge_sun", "Sunbeam Pioneer", "☀️", 1, "Greeted the morning sun with awake senses", "Circadian Rhythm"),
                BadgeInfo("badge_ear", "Attentive Ear", "👂", 1, "Turned toward the gentle bell sound", "Auditory Tracking"),
                BadgeInfo("badge_heart", "Bond of Trust", "💖", 1, "Found safety and calm in loving arms", "Primal Security")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_1_1", "Sensory Awakening", HumanPillar.BODY, description = "Responds to light, sounds, and soft textures with wonder"),
                SkillTreeNode("st_1_2", "Lullaby Memory", HumanPillar.MIND, description = "Soothed by familiar acoustic rhythms and maternal chants")
            ),
            characterTraits = listOf("Trust", "Wonder", "Receptive Calm")
        ),
        MasteryLevel(
            levelNumber = 2,
            title = "Seeker",
            ageRange = "1–2 Years",
            motto = "My feet carry me to new discoveries.",
            missions = listOf(
                LevelMission("m2_1", "Barefoot Grass Trail", "Mission", "Walk steadily over grassy bumps and uneven ground without shoes", "badge_foot", HumanPillar.BODY),
                LevelMission("m2_2", "Bowl of Resonance", "Challenge", "Drop 10 pebbles in a brass bowl with focused pincer grasp", "badge_pebble", HumanPillar.MIND),
                LevelMission("m2_3", "Gentle Hand Touch", "Quest", "Touch a pet or plant with one delicate finger without pulling", "badge_leaf", HumanPillar.CHARACTER)
            ),
            badges = listOf(
                BadgeInfo("badge_foot", "Earth Walker", "👣", 2, "Conquered natural grass trails barefoot", "Balance & Grounding"),
                BadgeInfo("badge_pebble", "Stone Alchemist", "🪨", 2, "Focused hand and eye to drop pebbles with rhythm", "Fine Motor Focus"),
                BadgeInfo("badge_leaf", "Gentle Touch", "🍃", 2, "Treated plants and pets with gentle hands", "Ahimsa & Care")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_2_1", "Toddler Locomotion", HumanPillar.BODY, description = "Crawl, climb, and balance over uneven surfaces"),
                SkillTreeNode("st_2_2", "Cause & Effect Wonder", HumanPillar.MIND, description = "Tests gravity and spatial object permanence")
            ),
            characterTraits = listOf("Bravery", "Curiosity", "Delight")
        ),
        MasteryLevel(
            levelNumber = 3,
            title = "Builder",
            ageRange = "2–3 Years",
            motto = "With blocks, words, and breath, I build my world.",
            missions = listOf(
                LevelMission("m3_1", "Crane on One Foot", "Mission", "Balance like a river crane for 5 slow counts on each leg", "badge_crane", HumanPillar.BODY),
                LevelMission("m3_2", "Tower of Ten", "Challenge", "Build a tower of 10 blocks that stays standing without falling", "badge_tower", HumanPillar.MIND),
                LevelMission("m3_3", "Volcano Breath Mastery", "Quest", "Notice angry feelings and blow out three birthday candles instead of shouting", "badge_breath", HumanPillar.EMOTIONS)
            ),
            badges = listOf(
                BadgeInfo("badge_crane", "River Crane", "🦩", 3, "Mastered steady balance on one foot like a heron", "Vestibular Mastery"),
                BadgeInfo("badge_tower", "Master Architect", "🏛️", 3, "Constructed steady towers and tried again if they fell", "Persistence"),
                BadgeInfo("badge_breath", "Calm Breath Alchemist", "🌬️", 3, "Cooled the inner volcano with deep soft breathing", "Emotional Self-Mastery")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_3_1", "Language Spark", HumanPillar.SOCIAL, description = "Uses words to express feelings and desires clearly"),
                SkillTreeNode("st_3_2", "Patience Sapling", HumanPillar.CHARACTER, description = "Waits for a 2-minute sand timer cheerfully")
            ),
            characterTraits = listOf("Patience", "Persistence", "Playfulness")
        ),
        MasteryLevel(
            levelNumber = 4,
            title = "Guardian",
            ageRange = "3–4 Years",
            motto = "I protect living things and speak kind words.",
            missions = listOf(
                LevelMission("m4_1", "The Lion & The Turtle", "Mission", "Perform powerful lion's roar then tuck silently into turtle shell", "badge_lion", HumanPillar.BODY),
                LevelMission("m4_2", "Seed Sprout Caretaker", "Challenge", "Water a pot of coriander seed every morning until green shoots appear", "badge_sprout", HumanPillar.TWENTY_FIRST_CENTURY),
                LevelMission("m4_3", "Friendship Bridge", "Quest", "Share a favorite toy with a playmate using peaceful turn-taking", "badge_hands", HumanPillar.SOCIAL)
            ),
            badges = listOf(
                BadgeInfo("badge_lion", "Courageous Lion", "🦁", 4, "Voiced courage and knew when to find turtle stillness", "Power & Stillness"),
                BadgeInfo("badge_sprout", "Green Guardian", "🌱", 4, "Nurtured a seed with patient daily care", "Ecology & Duty"),
                BadgeInfo("badge_hands", "Peace Weaver", "🤝", 4, "Resolved toy turns with kind words and big smiles", "Cooperation")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_4_1", "Empathy Shield", HumanPillar.EMOTIONS, description = "Notices when a friend is hurt and offers comfort"),
                SkillTreeNode("st_4_2", "Story Listener", HumanPillar.MIND, description = "Listens to a full story and answers moral questions")
            ),
            characterTraits = listOf("Kindness", "Protection", "Friendship")
        ),
        MasteryLevel(
            levelNumber = 5,
            title = "Leader",
            ageRange = "4–5 Years",
            motto = "I lead by being helpful and keeping my word.",
            missions = listOf(
                LevelMission("m5_1", "Obstacle Course Champion", "Mission", "Navigate a multi-step motor agility course with grace", "badge_obstacle", HumanPillar.BODY),
                LevelMission("m5_2", "The Squirrel's Sand Grain", "Challenge", "Perform an unsolicited act of helpful service in the family kitchen", "badge_squirrel", HumanPillar.CHARACTER),
                LevelMission("m5_3", "Star Gazing Trataka", "Quest", "Hold one-pointed gaze on an evening star for 45 seconds", "badge_star", HumanPillar.MIND)
            ),
            badges = listOf(
                BadgeInfo("badge_obstacle", "Nimble Pathfinder", "⚡", 5, "Completed the hero's agility course smoothly", "Physical Agility"),
                BadgeInfo("badge_squirrel", "Rama's Squirrel", "🐿️", 5, "Contributed small sincere effort with deep dedication", "Selfless Service"),
                BadgeInfo("badge_star", "Dhruva Star Gaze", "⭐", 5, "Held steady, quiet gaze without wavering", "One-pointed Focus")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_5_1", "Talking Stick Leader", HumanPillar.SOCIAL, description = "Listens to everyone before making a group decision"),
                SkillTreeNode("st_5_2", "Mistake Recovery", HumanPillar.EMOTIONS, description = "Smiles and says 'Mistakes help me grow!'")
            ),
            characterTraits = listOf("Integrity", "Humility", "Inspiration")
        ),
        MasteryLevel(
            levelNumber = 6,
            title = "Creator",
            ageRange = "5–6 Years",
            motto = "I invent solutions, question deeply, and care for all.",
            missions = listOf(
                LevelMission("m6_1", "Tree Pose River Hold", "Mission", "Hold graceful tree pose for 15 seconds without touching walls", "badge_tree", HumanPillar.BODY),
                LevelMission("m6_2", "The Cardboard Lab", "Challenge", "Build an invention from discarded boxes and explain its purpose", "badge_invent", HumanPillar.TWENTY_FIRST_CENTURY),
                LevelMission("m6_3", "Fairness Council", "Quest", "Solve a game argument fairly without needing parent referee", "badge_scales", HumanPillar.CHARACTER)
            ),
            badges = listOf(
                BadgeInfo("badge_tree", "Banyan Root", "🌳", 6, "Deep roots, unwavering balance, and gentle branches", "Rooted Poise"),
                BadgeInfo("badge_invent", "Vishwakarma Maker", "🎨", 6, "Transformed simple materials into a creative invention", "Systems Ingenuity"),
                BadgeInfo("badge_scales", "Wise Judge", "⚖️", 6, "Found a win-win compromise for playmates", "Dharmic Fairness")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_6_1", "Socratic Questioner", HumanPillar.MIND, description = "Asks 'Why?' to understand deep underlying causes"),
                SkillTreeNode("st_6_2", "Fearless Speaker", HumanPillar.SOCIAL, description = "Presents stories with strong eye contact and poise")
            ),
            characterTraits = listOf("Creativity", "Discernment", "Generosity")
        ),
        MasteryLevel(
            levelNumber = 7,
            title = "Wise Hero",
            ageRange = "6–7 Years",
            motto = "I focus on noble action with an open and resilient heart.",
            missions = listOf(
                LevelMission("m7_1", "Arjuna's Bow Focus", "Mission", "Hold laser focus on a single target leaf while in warrior stance for 1 minute", "badge_bow", HumanPillar.MIND),
                LevelMission("m7_2", "Community Seva Feast", "Challenge", "Help prepare and deliver food to an elderly neighbor or shelter", "badge_pot", HumanPillar.SOCIAL),
                LevelMission("m7_3", "Unshakeable Poise", "Quest", "Remain cheerful, shake hands, and learn when losing a competitive race", "badge_shield", HumanPillar.EMOTIONS)
            ),
            badges = listOf(
                BadgeInfo("badge_bow", "Arjuna's Focus", "🏹", 7, "Single-pointed attention ignoring all distractions", "Deep Concentration"),
                BadgeInfo("badge_pot", "Nourishing Heart", "🍲", 7, "Served nutritious food with unconditional kindness", "Living Seva"),
                BadgeInfo("badge_shield", "Gita's Steady Mind", "🛡️", 7, "Kept inner peace through both victory and defeat", "Samatvam Equanimity")
            ),
            skillTrees = listOf(
                SkillTreeNode("st_7_1", "Systems Navigator", HumanPillar.TWENTY_FIRST_CENTURY, description = "Understands how community, nature, and choices weave together"),
                SkillTreeNode("st_7_2", "Self-Mastery Pilot", HumanPillar.CHARACTER, description = "Governs personal habits, speech, and commitments with honor")
            ),
            characterTraits = listOf("Wisdom", "Equanimity", "Courageous Purpose")
        )
    )

    // --- PHASE 5: DAILY SYSTEM ROUTINES (Morning, Afternoon, Evening) ---
    val dailyRoutines = listOf(
        // MORNING
        ChildActivity("morn_1", "Sun Animal Salute (Movement Game)", HumanPillar.BODY, 6, "Morning",
            "Stretch like a waking cat, reach up like a golden sunflower, hop like a hare, and take a deep morning breath.",
            "Parent and child mirror each other's animal poses.",
            "Play joyful upbeat morning flute or acoustic music; make it playful, not rigid.",
            "Surya Vandana (Honoring morning light)", "Activates vestibular system and raises cortisol to healthy morning wakefulness"),
        ChildActivity("morn_2", "Three Thanks to Earth (Gratitude Game)", HumanPillar.EMOTIONS, 4, "Morning",
            "Place both hands over heart. Whisper 3 things we are thankful for today: sunlight, water, and our strong legs.",
            "Pass a warm stone or flower petal while naming gratitude.",
            "Encourage silly or heartfelt answers; never judge or correct their thanks.",
            "Kritajnata (Vedic thanksgiving)", "Stimulates dopamine pathways and primes positive emotional valence for the day"),
        ChildActivity("morn_3", "Bird & Leaf Spotter (Observation Challenge)", HumanPillar.MIND, 5, "Morning",
            "Look out the window or step on the balcony. Spot 2 birds, 1 fluttering leaf, and listen for the farthest sound.",
            "Spy game: 'I spy with my little eye something that is swaying in the wind!'",
            "Do this before any screens are touched. Quiet attentiveness to the living world.",
            "Pratyaksha (Direct observation of nature)", "Sensory gating training in the thalamus, preventing sensory overload"),
        ChildActivity("morn_4", "Bumblebee Hum (Breath Awareness Game)", HumanPillar.BODY, 4, "Morning",
            "Sit comfortably. Inhale deeply through nose, gently cover ears with thumbs, and hum like a honeybee on the out-breath: Mmmmmm!",
            "Feel the vibration buzzing in forehead and cheeks.",
            "Do 4 bumblebee hums together. Compare who can hum the smoothest buzz.",
            "Bhramari Pranayama", "Nitric oxide release in sinuses, vagus nerve stimulation, and auditory self-soothing"),

        // AFTERNOON
        ChildActivity("aft_1", "Hero's Quest Tale (Story Mission)", HumanPillar.CHARACTER, 10, "Afternoon",
            "Read a secular adapted tale from the epic curriculum (e.g. Nachiketa's Question or Squirrel's Bridge).",
            "Pause before the ending and ask child: 'What would YOU do if you were in their sandals?'",
            "Use expressive character voices; keep it under 10 minutes.",
            "Akhyana (Epic story moral reflection)", "Activates default mode network for narrative empathy and moral framing"),
        ChildActivity("aft_2", "Cardboard & Twig Forge (Creative Challenge)", HumanPillar.TWENTY_FIRST_CENTURY, 12, "Afternoon",
            "Give child recycled items, tape, twigs, or fallen flowers. Challenge: 'Create a shelter for a forest beetle.'",
            "Hands-on building with no predefined template.",
            "Refrain from taking over! Let child tape things upside down and test their own balance.",
            "Kala (Ancient arts and crafts)", "Engages parietal and motor cortices in 3D spatial problem solving"),
        ChildActivity("aft_3", "Cloud Animal Tracker (Nature Quest)", HumanPillar.MIND, 8, "Afternoon",
            "Lie on back in yard or by open window. Look up at moving clouds and identify 3 hidden creatures.",
            "Imagination and pattern association game.",
            "Discuss how clouds change shape without clinging to any one form.",
            "Anitya (Impermanence in nature)", "Divergent thinking and cognitive reappraisal of changing circumstances"),
        ChildActivity("aft_4", "The River Crossing Maze (Problem-Solving)", HumanPillar.SOCIAL, 8, "Afternoon",
            "Place 4 cushions on floor as stepping stones. Cross from couch to rug without touching the 'water'.",
            "Rule-based physical game with dynamic distance adjustments.",
            "Add a challenge: 'Can you carry a wooden spoon with a cotton ball across without dropping it?'",
            "Yukti (Strategic agility)", "Executive function, inhibitory control, and motor planning"),

        // EVENING
        ChildActivity("eve_1", "Rose, Thorn, & Seed (Reflection Game)", HumanPillar.EMOTIONS, 6, "Evening",
            "At dinner or cozy rug, each person shares: Rose (something sweet), Thorn (something hard), Seed (something we look forward to).",
            "Conversational turn-taking with no phones at the table.",
            "Parents share first to model vulnerability: 'My thorn was getting stuck in traffic, my rose was your warm hug!'",
            "Manana (Daily reflection)", "Memory consolidation and emotional processing in the hippocampus"),
        ChildActivity("eve_2", "Kindness Whisper Circle (Family Discussion)", HumanPillar.SOCIAL, 5, "Evening",
            "Look at each family member and say one kind observation: 'I noticed you helped clean up the crayons today.'",
            "Eye contact and genuine spoken appreciation.",
            "End with a group hug or high-five.",
            "Maitri (Loving-kindness)", "Reinforces social bonding via endogenous oxytocin release"),
        ChildActivity("eve_3", "The Weather Inside Me (Emotional Check-in)", HumanPillar.EMOTIONS, 5, "Evening",
            "Ask: 'What is the weather inside your heart right now? Is it sunny, cloudy, stormy, or a calm starry night?'",
            "Metaphorical emotion tracking.",
            "Normalize all weather: 'Even storms pass, and the blue sky is always behind the clouds.'",
            "Sakshi Bhava (Witnessing consciousness)", "Prevents emotional fusion; teaches emotion regulation without suppression"),
        ChildActivity("eve_4", "Floating Lotus Sleep (Calmness Practice)", HumanPillar.BODY, 8, "Evening",
            "Lie in bed with soft light. Place a tiny paper flower on child's belly. Watch it gently rise and fall with breathing like a boat on calm water.",
            "Visual and tactile biofeedback on belly breathing.",
            "Count 10 slow breaths until eyes feel heavy and relaxed.",
            "Shanti Kriya (Yogic twilight soothing)", "Triggers parasympathetic shift, lowering heart rate for deep restorative sleep")
    )

    // --- PHASE 6: EMOTIONAL INTELLIGENCE TRAINING (10 CORE GAMES) ---
    val eqGames = listOf(
        EmotionalGame("eq_1", "Recognizing Emotions", "The Mirror of Chitrakuta",
            "Rama looked into the clear forest pond and saw his face calm even during exile.",
            "Faces transmit micro-expressions; recognizing physical cues (clenched jaw, wide eyes) bridges somatic awareness to conscious regulation.",
            "Parent makes an emotion face (worried, surprised, excited, tired). Child identifies it and imitates in a handheld mirror.",
            "Point out physiological markers: 'Notice how your shoulders drop when you pretend to be relaxed!'"),
        EmotionalGame("eq_2", "Naming Emotions", "The Great Vocabulary Scroll",
            "In the Upanishads, naming something (Nama-Rupa) allows us to understand and navigate it without fear.",
            "fMRI studies show that 'naming an emotion to tame it' reduces amygdala reactivity by activating the ventrolateral prefrontal cortex.",
            "Use an emotion wheel with 8 distinct feelings: Frustrated, Proud, Lonely, Curious, Worried, Joyful, Peaceful, Overwhelmed.",
            "Help them expand beyond 'sad' or 'mad'. Say: 'Are you mad, or do you feel left out?'"),
        EmotionalGame("eq_3", "Managing Emotions", "Hanuman's Chest of Clouds",
            "When Hanuman felt overwhelming heat or fury, he remembered his breath and expanded like the sky.",
            "Deep exhalations twice as long as inhalations stimulate the vagus nerve, slowing tachycardia.",
            "Teach the 'Blowing Hot Soup' game: Inhale deeply for 3 counts, then blow out gently on an imaginary spoon of soup for 6 counts.",
            "Practice when calm so it is readily accessible during a real meltdown."),
        EmotionalGame("eq_4", "Empathy", "The Squirrel & The Bear",
            "When the great bears dropped boulders into the ocean, they did not laugh at the tiny squirrel; they appreciated its golden heart.",
            "Mirror neurons activate when we imagine another's physical experience, laying the biological groundwork for altruism.",
            "Role-play with stuffed animals: 'Panda dropped his ice cream cone! What is Panda thinking right now? What can Bear say?'",
            "Ask: 'How would you feel if that happened to you?'"),
        EmotionalGame("eq_5", "Patience", "The Waiting Acorn",
            "King Janaka sat patiently by the river, watching seeds crack open in their own time.",
            "Delayed gratification correlates with higher executive control, working memory, and academic stamina.",
            "Use a physical 3-minute sand glass timer for snacks or turn-taking. While the sand falls, sing a quiet waiting song.",
            "Never use patience as a punishment; make it a challenge of inner strength."),
        EmotionalGame("eq_6", "Delayed Gratification", "The Honeycomb Quest",
            "Forest ascetics in the Puranas knew that waiting for ripe fruit yields the sweetest nectar.",
            "Dopaminergic pathways can be trained to savor anticipation rather than crave instant hits.",
            "Offer a choice: 'You can have one strawberry slice now, OR wait until after we finish building this block bridge and get a bowl of strawberries with honey!'",
            "Celebrate whenever they choose the patient path without forcing them."),
        EmotionalGame("eq_7", "Conflict Resolution", "The Two Princes & The Swan",
            "Devadatta shot a swan with an arrow, but Siddhartha cared for its wounded wing. The wise council judged: the bird belongs to the one who saved its life.",
            "Bilateral perspective-taking de-escalates amygdala hijack during disputes.",
            "Introduce the 'Talking Feather'. Only the person holding the feather speaks; the other listens and repeats what they heard.",
            "Teach restitution: 'What can we do to make this better?' instead of empty forced apologies."),
        EmotionalGame("eq_8", "Courage", "Little Abhimanyu's Fortress",
            "Young Abhimanyu had the courage to enter the labyrinth because he trusted his preparation and focused mind.",
            "Systematic exposure to mild manageable stressors creates stress inoculation and neuroplastic resilience.",
            "The 'Butterfly Belly Game': 'It is normal to feel fluttery butterflies in your belly before trying something new. Let us tell our butterflies to fly in formation!'",
            "Acknowledge the fear: 'It is okay to be scared. Courage is doing what is right even with butterflies.'"),
        EmotionalGame("eq_9", "Confidence", "The Unshakeable Mountain",
            "Mount Meru stands firm in storms, rooted in the earth, letting rain wash over its rocks.",
            "Proprioceptive upright posture sends neuro-chemical signals increasing testosterone-cortisol ratio, cultivating grounded self-assurance.",
            "Stand in Mountain Pose (Tadasana): Feet rooted, chin level, shoulders back. Say firmly: 'I am rooted, I am capable, I can learn!'",
            "Remind them of past obstacles they conquered independently."),
        EmotionalGame("eq_10", "Public Speaking", "The Forest Storyteller",
            "Sage Valmiki gathered listeners under the shade of trees, speaking with clear melody, eye contact, and dignity.",
            "Expressive speech engages Broca's area, larynx control, and builds communicative leadership.",
            "Family 'Show & Tell': Child stands on a soft footstool 'stage' with a favorite drawing or leaf, and presents for 90 seconds. Family applauds respectfully.",
            "Coach eye contact, clear loud voice, and taking a breath before beginning.")
    )

    // --- PHASE 7: ATTENTION & FOCUS TRAINING (Progressive from 2 to 7) ---
    val focusTrainings = listOf(
        FocusTraining("foc_1", "Trataka Flame / Amber Light Gaze", "Observation", 3, 3,
            "Gaze gently at a warm amber candle flame or golden nightlight from 4 feet away without turning head. When the chime rings, close eyes and see the bright point in the mind's eye.",
            "Trataka (Yogic eye gazing)", "Dorsolateral prefrontal cortex sustained attention network conditioning"),
        FocusTraining("foc_2", "The Wind In The Trees Breath", "Breath", 2, 4,
            "Place hands on ribcage. Inhale: ribs expand outward like branches in a breeze. Exhale: ribs soften. Count 5 breaths together.",
            "Prana-dharana (Breath awareness)", "Heart-rate variability (HRV) coherence and vagal activation"),
        FocusTraining("foc_3", "The Sound Hunter (Nada Shravana)", "Listening", 3, 5,
            "Ring a singing bowl, bell, or chime. Close eyes and listen until the very last trace of sound completely fades away into silence, then raise hand.",
            "Nada Yoga acoustic focus", "Auditory cortex filtering and signal-to-noise ratio enhancement"),
        FocusTraining("foc_4", "Shruti Repeating Rhymes", "Memory", 4, 6,
            "Parent chants a 4-word rhythmic cadence or verse (e.g. 'Om Bhur Bhuvah Svah' or four animal names). Child chants it back with identical pitch and rhythm. Increase to 6 words.",
            "Shruti memorization tradition", "Phonological loop in working memory and rapid auditory processing"),
        FocusTraining("foc_5", "The Mandala Pattern Builder", "Pattern", 4, 8,
            "Place leaves, seeds, and colored pebbles in symmetric concentric rings. Start with 3 center pebbles, then alternating petals.",
            "Yantra geometric focus", "Spatial reasoning, visual-motor precision, and bilateral symmetry cognition"),
        FocusTraining("foc_6", "Statue of the Forest Sage", "Concentration", 5, 5,
            "Freeze like an ancient sage meditating by a waterfall. No giggles, no wiggles for 60 seconds. Parent tries funny (gentle) faces to test their resolve.",
            "Dharana (Steadfast stillness)", "Inhibitory control and motor cortex suppression")
    )

    // --- PHASE 8: PHYSICAL DEVELOPMENT & ANIMAL MOVEMENTS ---
    val physicalMovements = listOf(
        PhysicalMovement("phy_1", "Simha (Lion)", "Lion's Powerful Roar", "Strength & Breath",
            "Kneel with hands on knees. Inhale, then lunge forward onto palms, open mouth wide, stick out tongue, roll eyes upward, and exhale with a great roar: HAAAH!",
            "RROOOAAARRR!", "Feel your neck, jaw, and chest release all tension like a brave lion."),
        PhysicalMovement("phy_2", "Vanara (Monkey)", "Monkey Tree Leaps", "Agility & Coordination",
            "Squat low on balls of feet. Reach hands to floor on the right, hop feet to follow. Then reach to the left and hop feet across.",
            "Ooh-Ooh Aah-Aah!", "Spring from strong toes and keep your knees bouncy like rubber balls."),
        PhysicalMovement("phy_3", "Gaja (Elephant)", "Elephant Trunk March", "Balance & Core",
            "Stand tall, hinge forward at hips with straight legs. Interlace hands together to form an elephant trunk. March with heavy steps, swinging trunk side to side.",
            "THUMP... SWISH... THUMP!", "Feel your feet rooted deeply into the earth like heavy stone pillars."),
        PhysicalMovement("phy_4", "Baka (Crane)", "Graceful Crane Balance", "Balance & Vestibular",
            "Stand on one leg, lift the opposite knee to chest level, spread arms like broad feathered wings. Hold for 10 counts, then smoothly swap legs.",
            "Whoosh... flap... still!", "Find a quiet spot on the wall to look at so you do not wobble."),
        PhysicalMovement("phy_5", "Sarpa (Snake)", "Cobra Slither", "Flexibility & Spinal Strength",
            "Lie on belly. Place palms flat beneath shoulders. Inhale, push gently through hands to lift head and chest while keeping hips glued to the floor. Hiss softly.",
            "SSSSSSssssssss!", "Keep shoulders away from ears and feel your spine curve like a graceful wave."),
        PhysicalMovement("phy_6", "Kurma (Turtle)", "Turtle Shell Retreat", "Calmness & Flexion",
            "Sit with soles of feet touching, knees wide like a diamond. Slide hands under shins, fold forehead down toward toes, tucking safely inside shell.",
            "Quiet... safe... still...", "Breathe into your back ribs like the shell is expanding gently.")
    )

    // --- PHASE 9: STORY CURRICULUM SAMPLE & ENGINE ---
    val coreStories = listOf(
        StoryItem(
            id = "story_1",
            dayNumber = 1,
            title = "The Squirrel's Bridge of Sand",
            scriptureOrigin = ScriptureOrigin.RAMAYANA,
            ageStage = AgeStage.STAGE_3_4,
            storySummary = "While mighty bears and monkeys threw huge boulders into the sea to build a bridge, a tiny squirrel rolled in sand and shook the grains between the rocks.",
            fullNarration = "Long ago by the great southern sea, Prince Rama and his companions were building a bridge of stone. The powerful monkeys carried mountains, and the giant bears lifted boulders with mighty roars. Among the churning waves scampered a tiny striped squirrel. She ran to the water's edge, dipped her soft fur into the foam, rolled in the dry golden sand until coated with grains, and scampered out onto the bridge. Shaking her body vigorously, she showered sand grains into the gaps between the giant stones! A monkey laughed: 'Little one, get out of the way before you get squashed! What can your tiny sand grains do against the ocean?' The squirrel replied with shining eyes: 'I may not have the strength of a bear, but I have my whole heart and these two paws. I will do my part.' Prince Rama saw this and smiled. He gently picked up the squirrel in his warm palm and stroked her back with three fingers, leaving three loving stripes: 'Every drop of sincere effort is precious. Without the small grains of sand, the giant stones would slip.'",
            mainLesson = "No act of kindness or effort is too small. When everyone contributes what they can, great wonders are built.",
            emotionalLesson = "Feeling small or inadequate can be overcome by focusing on sincere effort rather than comparison with others.",
            discussionQuestions = listOf(
                "Why did the monkey laugh at the squirrel?",
                "What made Prince Rama smile at the tiny squirrel?",
                "What is something small YOU can do to help our home today?"
            ),
            realLifeChallenge = "Pick up 5 small pieces of scrap paper or toys and put them in their place without anyone asking.",
            familyActivity = "Bake or prepare a meal together where the child is given a crucial 'small' job (sprinkling sesame seeds, washing spinach leaves)."
        ),
        StoryItem(
            id = "story_2",
            dayNumber = 2,
            title = "Nachiketa's Three Questions",
            scriptureOrigin = ScriptureOrigin.UPANISHADS,
            ageStage = AgeStage.STAGE_5_6,
            storySummary = "A curious young boy named Nachiketa refuses to accept shiny toys when he can ask the deepest questions about life and inner truth.",
            fullNarration = "In the ancient forest lived a boy named Nachiketa with eyes like bright morning stars. His father was giving away old, tired cows that could no longer give milk, pretending he was being generous. Nachiketa noticed this and asked: 'Father, if you are giving away what is most precious, to whom will you give me?' His father, annoyed, said: 'I give you to Yama, the teacher of truth!' Nachiketa was not afraid. He walked through forests and mountains to the halls of Yama. Yama was not at home, so Nachiketa waited at the doorstep for three days and three nights without food or water, patient as an oak tree. When Yama returned, he felt regret for making a young guest wait: 'Ask for three boons, brave boy, and they shall be yours!' For his first boon, Nachiketa asked for peace and harmony in his family. For his second, he asked for the fire of knowledge that helps humans learn. For his third, Yama offered chariots made of gold, singing horses, and heaps of gems. But Nachiketa shook his head with a gentle smile: 'All these toys wear out tomorrow. Teach me the secret of who I truly am behind my thoughts!' Yama smiled, for he had found a true student of wisdom.",
            mainLesson = "Curiosity and seeking understanding are far more valuable than fleeting shiny toys.",
            emotionalLesson = "Courage to question unfairness respectfully and patience to wait for genuine knowledge.",
            discussionQuestions = listOf(
                "Why did Nachiketa refuse the golden chariots and toys?",
                "What was the most important question Nachiketa wanted answered?",
                "What is a big question about the world or nature that YOU wonder about?"
            ),
            realLifeChallenge = "Ask your parent one question about nature (like how trees drink or where wind comes from) and research it together in a book.",
            familyActivity = "Hold a 10-minute 'Why? Inquiry Circle' where family members take turns asking curious questions about the world."
        ),
        StoryItem(
            id = "story_3",
            dayNumber = 3,
            title = "Arjuna's One-Pointed Gaze",
            scriptureOrigin = ScriptureOrigin.MAHABHARATA,
            ageStage = AgeStage.STAGE_4_5,
            storySummary = "Teacher Drona places a toy wooden bird in a tree and asks his students what they see. Only Arjuna sees the single target eye.",
            fullNarration = "In the shade of the mango grove, Guru Drona placed a carved wooden bird among high leafy branches. He called Prince Yudhishthira: 'Step forward, draw your bow, and tell me: what do you see?' Yudhishthira replied: 'I see the vast blue sky, the leafy branches, the tree bark, and the wooden bird.' Drona said: 'Lower your bow, you will not shoot today.' He called Duryodhana, Bhima, and Nakula. Each student described the clouds, the fruit, the leaves, and the bird's feathers. Finally, young Arjuna stepped forward. He stood with feet rooted like stone pillars, his bow pulled smooth and steady. 'Arjuna, what do you see?' asked Drona. Arjuna replied in a calm voice: 'I see only the eye of the bird.' 'Do you not see the tree, Arjuna?' 'No, Master.' 'Do you not see the blue sky or the clouds?' 'No, Master. I see only the black center of the bird's eye.' Drona smiled proudly: 'Release your arrow!' The arrow flew true, striking the target perfectly. Drona told all the princes: 'When your mind wanders to the leaves and clouds, your arrow misses. When your focus is one-pointed, no goal is beyond your reach.'",
            mainLesson = "Focus is the superpower that turns practice into mastery. When doing something, be completely present in that one thing.",
            emotionalLesson = "Ignoring distractions requires calming the restless mind and finding stillness within.",
            discussionQuestions = listOf(
                "What did all the other princes see in the tree?",
                "Why was Arjuna able to see only the bird's eye?",
                "When you are drawing or building blocks, what distracts you?"
            ),
            realLifeChallenge = "Pick one task (like drawing a leaf or tying your shoes) and do it for 3 minutes without looking away or talking.",
            familyActivity = "Play the 'Laser Focus Game' where you balance a coin on the back of your hand while walking across the room."
        ),
        StoryItem(
            id = "story_4",
            dayNumber = 4,
            title = "The Charioteer's Secret of Effort",
            scriptureOrigin = ScriptureOrigin.BHAGAVAD_GITA,
            ageStage = AgeStage.STAGE_6_7,
            storySummary = "Krishna explains to a distressed warrior that true peace comes from putting full effort into right action without obsessing over winning or losing.",
            fullNarration = "On the plains between two armies, Arjuna felt his hands tremble and his bow slip to the floor. 'What if I fail? What if things turn out terribly? My heart is heavy!' His wise friend and charioteer, Krishna, looked at him with warm, calm eyes and placed a steady hand upon his shoulder. 'Arjuna, listen to the eternal rhythm of life. You have the power to choose your effort and your actions, but the fruits of those actions belong to the universe. If you only act when you are guaranteed victory, you will be paralyzed by fear. But if you dedicate your full heart, skill, and integrity to the noble work before you—without obsessing over winning praise or fearing defeat—you become invincible.' Krishna smiled and pointed to a blooming lotus in a nearby marsh: 'Look at the lotus flower, Arjuna. It grows from muddy water, yet not a single drop of mud sticks to its soft petals. Be like the lotus in action. Do your duty with love and excellence, and remain untouched by anxiety.' Arjuna took a deep breath, picked up his bow, and stood tall with clear purpose.",
            mainLesson = "Do your best and let go of the rest. Focus on what you can control: your own effort, kindness, and focus.",
            emotionalLesson = "Overcoming performance anxiety and outcome obsession through process dedication.",
            discussionQuestions = listOf(
                "Why were Arjuna's hands shaking?",
                "What did Krishna teach about the lotus flower in the mud?",
                "How can you remember this when playing a game or trying a difficult drawing?"
            ),
            realLifeChallenge = "Play a board game or run a race today. Whether you win or lose, celebrate your effort and give your opponent a cheerful high-five.",
            familyActivity = "Draw a blooming lotus on a piece of paper and write your family's daily noble intention in the center."
        ),
        StoryItem(
            id = "story_5",
            dayNumber = 5,
            title = "Ganesha & The Whole Universe",
            scriptureOrigin = ScriptureOrigin.PURANAS,
            ageStage = AgeStage.STAGE_2_3,
            storySummary = "Kartikeya flies around the globe on a peacock, but wise little Ganesha walks around his loving parents, knowing love and wisdom are the whole universe.",
            fullNarration = "One bright sunny morning on Mount Kailash, Shiva and Parvati held up a golden mango of wisdom. 'This sweet fruit shall belong to whichever son circles the entire universe first!' Swift Kartikeya leaped onto his magnificent peacock. With a rush of feathers and wind, he flew across oceans, mountains, continents, and star clusters, circling the planet at lightning speed. Little Ganesha looked at his round belly and his tiny friend, the mouse. He knew he could not outfly a peacock. Instead of sulking or giving up, Ganesha paused and thought with a deep smile. He approached his mother and father with folded hands, bowed with deep love, and walked in a circle around both of them three times! Shiva asked: 'Ganesha, why did you walk around us instead of flying around the world?' Ganesha replied: 'My parents who gave me life, wisdom, and love are my entire universe. In walking around you with respect, I have circled the world.' Shiva and Parvati hugged Ganesha and handed him the golden mango. When Kartikeya returned, panting and sweating, he listened to Ganesha's wisdom and smiled, happily sharing the sweet fruit together.",
            mainLesson = "Wisdom and love see what speed and rushing miss. Respect and gratitude for family is the greatest journey.",
            emotionalLesson = "Thinking outside the box when feeling physically outmatched; finding contentment through gratitude.",
            discussionQuestions = listOf(
                "How did Kartikeya try to win the mango?",
                "What clever and loving thing did Ganesha do?",
                "Who are the people in your life who make up your universe?"
            ),
            realLifeChallenge = "Walk up to someone you love today, give them a warm hug, and say: 'You are an important part of my universe!'",
            familyActivity = "Create a 'Family Universe Chart' where each family member places handprints with sweet messages around each other."
        )
    )

    // --- PHASE 11: ANTI-FRAGILE CHILD DESIGN (6 PRINCIPLES) ---
    val antiFragilePrinciples = listOf(
        AntiFragilePrinciple(
            id = "af_1",
            title = "How to Fail Safely",
            challengeType = "Fail Safely",
            ancientAnchor = "Abhyasa (Continuous practice without fear of falling in Yoga Sutras)",
            scientificInsight = "Myelination occurs most rapidly when the brain experiences small manageable prediction errors and adjusts motor/cognitive strategy.",
            realLifeScenario = "Child builds a 12-block tower that wobbles and crashes to the carpet with a loud clatter.",
            parentScript = "Avoid: 'Oh no, you ruined it!' Say instead: 'CRASH! What a magnificent sound! Look at how high you got it before gravity took over. What did that block teach you about balance?'",
            childActionStep = "Laugh together, take a deep breath, and rebuild with a wider base."
        ),
        AntiFragilePrinciple(
            id = "af_2",
            title = "How to Recover from Mistakes",
            challengeType = "Recover from Mistakes",
            ancientAnchor = "Prayashchitta (Constructive course correction rather than shame in Dharma scriptures)",
            scientificInsight = "Shame activates dorsal anterior cingulate cortex (social pain); constructive repair activates striatal reward pathways of agency.",
            realLifeScenario = "Child accidentally spills a glass of milk across the dining table during dinner.",
            parentScript = "Avoid shouting 'Look at what you did!' Say calmly: 'Milk spilled! Accidents happen to everyone. Let's get two cloths and wipe it up together. Teamwork!'",
            childActionStep = "Take a dry towel and participate actively in wiping up the spill without fear."
        ),
        AntiFragilePrinciple(
            id = "af_3",
            title = "How to Handle Rejection",
            challengeType = "Handle Rejection",
            ancientAnchor = "Samatvam (Maintaining inner dignity and equilibrium in the Bhagavad Gita)",
            scientificInsight = "Cognitive reframing prevents amygdala chronic hyper-vigilance and builds social self-efficacy.",
            realLifeScenario = "At the playground, two children playing tag say: 'No, you can't play with us right now!'",
            parentScript = "Avoid: 'Those kids are mean!' Say: 'It stings to hear that. Their choice is about their game, not about your worth. Let's find another adventure or invite someone else.'",
            childActionStep = "Say calmly: 'Okay!' and pivot to swing on the monkey bars or build a sandcastle."
        ),
        AntiFragilePrinciple(
            id = "af_4",
            title = "How to Manage Frustration",
            challengeType = "Manage Frustration",
            ancientAnchor = "Titiksha (Calm endurance of temporary thermal and emotional fluctuations)",
            scientificInsight = "Somatic interoception (noticing tight fists, raised heartbeat) allows top-down cortical braking before emotional dysregulation.",
            realLifeScenario = "Shoelaces won't tie or a drawing does not look like the elephant the child imagined.",
            parentScript = "Acknowledge first: 'Your hands are working so hard and it's frustrating when it doesn't match your vision. Let's shake our hands out like wet noodles.'",
            childActionStep = "Shake hands out, take 3 'cool soup' breaths, and try with a smaller step."
        ),
        AntiFragilePrinciple(
            id = "af_5",
            title = "How to Solve Problems Independently",
            challengeType = "Solve Independently",
            ancientAnchor = "Yukti & Viveka (Ingenious strategic discernment without relying on external crutches)",
            scientificInsight = "Premature parental rescue deprives children of dopamine surges associated with overcoming cognitive dissonance.",
            realLifeScenario = "Child's toy car is stuck behind a heavy bookshelf, and child immediately cries: 'Mommy, get it now!'",
            parentScript = "Do not immediately retrieve it. Crouch down: 'That car is really wedged in there. What tool or long stick could we use to reach back there?'",
            childActionStep = "Search for a ruler or cardboard tube to gently probe and rescue the toy car."
        ),
        AntiFragilePrinciple(
            id = "af_6",
            title = "How to Take Responsibility",
            challengeType = "Take Responsibility",
            ancientAnchor = "Kula-dharma (Family stewardship and honor of personal contribution)",
            scientificInsight = "Prosocial responsibility increases self-perceived competence and reduces behavioral externalizing problems.",
            realLifeScenario = "Child left paints and wet brushes on the living room table when going outside to play.",
            parentScript = "Avoid cleaning it silently in frustration. Call child warmly: 'Arya, your art station needs your magic touch to be ready for tomorrow. Let's close the caps.'",
            childActionStep = "Return, wash brushes in water jar, and restore the table with pride."
        )
    )

    // --- PHASE 12: ROADMAP CARDS (Ancient Principle + Science + Mechanics Matrix) ---
    val roadmapMatrix = listOf(
        RoadmapCard(
            id = "rc_1",
            title = "Sensory Genesis & Primal Trust",
            pillar = HumanPillar.BODY,
            ageRange = "0–1 Years",
            ancientPrincipleUsed = "Surya Sparsha & Prithvi Sparsha (Vedic solar attunement and earth contact)",
            modernScientificJustification = "Circadian photoreceptor entrainment via morning blue-spectrum photons regulates cortisol/melatonin cycling and stabilizes infant sleep rhythms.",
            childFriendlyActivity = "Sunrise Window Hug & Grass Tickle",
            gameMechanics = "Gentle bicycle legs to 4-beat lullaby with tactile morning grass touch.",
            parentInstructions = "Hold infant facing gentle sunlight through window or open porch for 5 minutes at dawn. Sing in low steady tone.",
            successIndicators = "Infant relaxes muscle tension, locks eye contact with parent, and displays calm alert state.",
            futureProgression = "Transitions into independent crawling and barefoot obstacle exploration at age 1."
        ),
        RoadmapCard(
            id = "rc_2",
            title = "The Squirrel's Habit of Small Daily Seva",
            pillar = HumanPillar.CHARACTER,
            ageRange = "2–3 Years",
            ancientPrincipleUsed = "Seva & Nishkama Bhava (Ramayana squirrel allegory)",
            modernScientificJustification = "Repetitive small prosocial tasks activate the mesolimbic reward pathway, wiring contribution as intrinsically rewarding.",
            childFriendlyActivity = "The Tiny Helper's Magic Basket",
            gameMechanics = "Child carries miniature basket, collecting 3 fallen laundry socks or twigs, cheering with a bell tap.",
            parentInstructions = "Never offer money or treats; praise the functional contribution: 'Our living room is clean because of your two hands!'",
            successIndicators = "Spontaneously picks up fallen objects and smiles with pride.",
            futureProgression = "Leads to independent room tidying and cooperative fort building by age 4."
        ),
        RoadmapCard(
            id = "rc_3",
            title = "Laser Focus (Arjuna's Arrow Gaze)",
            pillar = HumanPillar.MIND,
            ageRange = "4–5 Years",
            ancientPrincipleUsed = "Ekagrata & Trataka (Mahabharata & Yogic concentration)",
            modernScientificJustification = "Sustained fixational saccade suppression strengthens the dorsal attention network and frontal eye fields, crucial for reading fluency.",
            childFriendlyActivity = "The Feather Target Archer",
            gameMechanics = "Fix gaze on a single feather pinned to a wall while holding steady warrior stance for 45 seconds.",
            parentInstructions = "Use a gentle timer chime. When eyes wander, cue softly: 'Bring your eagle eyes back to the feather tip.'",
            successIndicators = "Maintains still gaze for 45+ seconds without agitation.",
            futureProgression = "Forms the foundation for deep study, reading stamina, and chess strategy at age 6-7."
        ),
        RoadmapCard(
            id = "rc_4",
            title = "Equanimity Under Fire (The Lotus in Action)",
            pillar = HumanPillar.EMOTIONS,
            ageRange = "5–6 Years",
            ancientPrincipleUsed = "Samatvam & Karmanye Vadhitakaraste (Bhagavad Gita process focus)",
            modernScientificJustification = "Cognitive decoupling of performance outcome from self-worth prevents cortisol flooding and learned helplessness.",
            childFriendlyActivity = "The Unshakeable Champion Game",
            gameMechanics = "Race toy cars or run sprints; whoever loses high-fives the winner first and shouts: 'I gave my best effort!'",
            parentInstructions = "Model graceful sportsmanship. Emphasize excitement of the run rather than the finish ribbon.",
            successIndicators = "Smiles, shakes hands, and initiates another round without crying or brooding.",
            futureProgression = "Develops lifelong academic resilience, entrepreneurial risk tolerance, and anti-fragility."
        ),
        RoadmapCard(
            id = "rc_5",
            title = "Socratic Questioning & Ecological Systems",
            pillar = HumanPillar.TWENTY_FIRST_CENTURY,
            ageRange = "6–7 Years",
            ancientPrincipleUsed = "Prashna & Rta (Upanishadic inquiry and cosmic interconnectedness)",
            modernScientificJustification = "Epistemic curiosity stimulation fosters high synaptic arborization in the association cortex, promoting systems-level reasoning.",
            childFriendlyActivity = "The Honeybee & Apple Detective",
            gameMechanics = "Trace an apple on the kitchen table back through the store, truck, orchard, flower, bee, pollen, and rain.",
            parentInstructions = "Ask 'And what made that possible?' at each stage. Draw a spiderweb diagram together on butcher paper.",
            successIndicators = "Child explains multi-step dependencies and expresses gratitude for natural ecosystem.",
            futureProgression = "Prepares child for 21st-century environmental science, design thinking, and ethical leadership."
        )
    )
}
