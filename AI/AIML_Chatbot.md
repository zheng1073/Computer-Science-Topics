### AIML (Artifical Intelligence Modeling Language)

## Introduction
Mainly used to design a chatbot. 
Made up of:
1. Wildcards
2. Srai
3. Random
4. Set, get
5. That
6. Topic
7. Think
8. Condition

## pandorabots
1. Sign up
2. Plus icon next to my bots
3. Name, Language, Content
4. Edit --> code editor  

```AIML
// can only have one pattern and one template per category
<category>
  <pattern>WHAT IS YOUR NAME</pattern>   // contains the question; all capital and no punctuation
  <template>My name is tutorial!</template>  // answer
</category>
```

# wildcard
Allows you to replace any word with the wildcard (*)

```AIML
<category>
  <pattern>*</pattern>
  <template> <star index="2" /> </template> // star repeats what's in the wildcard
</category> 
```

# Srai
Refer to another category 
```AIML
<category>
  <pattern>TELL ME WHAT * IS</pattern>
  <template><srai>WHAT IS <star></srai> </template>
</category>
```

# That
Context-aware tag
```AIML
<category>
  <pattern>TELL ME MORE</pattern>
  // Pattern can give us a different response depending on <that>
  <that>MY NAME IS TUTORIAL</that>
  <template>There is not much else to say</template>
</category>
```

# Random
Computer will select a template to run
```AIML
<category>
  <pattern>PICK A NUMBER</pattern>
  <template>
    <random>
      <li>One</li>
      <li>Two</li>
      <li>Three</li>
    </random>
  </template>
</category>
```

# Comments
<!-- this is a comment -->

# Set, Get
Work with variables, 
```AIML
<category>
  <pattern>MY NAME IS *</pattern>
  <template>Hi <set name = "username"><star /></template>
</category>

<category>
  <pattern>WHAT IS MY NAME</pattern>
  <template>Your name is <set name = "username"/></template>
</category>
```

# Think
Way of setting a variable without outputting it
```AIML
<category>
  <pattern>MY NAME IS *</pattern>
  <template>Hi <think><set name = "username"><star /></think></template>
</category>
```

# Condition
User give one input where several inputs are available; IF statement
```AIML
<category>
  <pattern>WHAT IS *</pattern>
  <template>
    <think><set name = "state"><star /></set></think>
    <condition name="state" value = "England">England is in Europe.</condition>
    <condition name="state" value = "Brazil">Brazil is in South America.</condition>
  </template>
</category>
```

# Topic
If you have 2 patterns that are the same, you can use the topic tag to divide them.
```AIML
<category>
  <pattern>LETS TALK ABOUT ELVES</pattern>
  <template>
    <think><set name="topic">elves</set></think>
    yes let's discuss elves!
  </template>
</category>

<category>
  <pattern>LETS TALK ABOUT CATS</pattern>
  <template>
    <think><set name="topic">cats</set></think>
    yes let's discuss cats!
  </template>
</category>

<!-- if topic = elves, then you can access whatever is in elves -->
<topic name="elves">
  <category>
    <pattern>WHAT DO THEY LOOK LIKE</pattern>
    <template>Big pointy ears</template>
  </category>
 </topic>
 
 <topic name="cats">
  <category>
    <pattern>WHAT DO THEY LOOK LIKE</pattern>
    <template>little fury things</template>
  </category>
 </topic>
```
