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
