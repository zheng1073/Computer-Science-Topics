1. Create a framework
2. Match framework to DS and ML tools
3. Learn by doing

## Sample framework: (6 steps)
- Problem definition
  - supervised vs unsupervised, classification vs regression
- Data
  - structured (excel) vs unstructured (audio/video/images)
- Evaluation
  - Accuracy/ goal/ etc
- Feature
  - parameters
- Modeling
  -  what model are we using?
- Experiments

### Main types of Machine Learning
Supervised Learning
 - Data and Labels
 - Classification
  - predicting if something is one thing or another
  - Binary Classification - if only 2 options
  - Multi-class Classification - more than 2 options
 - Regression
  - Trying to predict a number
  
Unsupervised Learning
- data but no labels
- find patterns and group customers with similar interest together
- use patterns to create labels aka clustering or recommendation

Transfer Learning
- leverages what one ML model learning into another

Reinforcement Learning
- reward if computer does something well or punish if it does it poorly

### Types of data
- Structred ,Unstructured
- Static vs unstatic
  - static --> doesn't change over time
- streaming --> data that changes over time (stock prices)

### Evaluation
- how well ML predicts the future
- different types of metrics:
  - Classification: accuracy, precision, recall
  - Regression: Mean Absolute Error (MAE), Mean Squared Error (MSE), Root Mean Squared Error (RMSE)
  - Recommendation: Precision at K

### Features
- What do we already know?
- features aka different forms of data
- types of feature:
  - numerical, categorical, dervived 
- sf

### Modeling
3 parts to modeling: (Splitting Data)
1. Choosing and training a model (Train)
  - Structured data, use --> catboost, xgboost, random forest
  - Unstructured data, use --> deep learning, transfer learning
  - train it by lining up the inputs to outputs (X (data) to predict y (label))
2. Tuning a model (Validation)
  - random forest --> adjust number of trees
  - neural networks --> adjust number of layers
3. Model comparison (Test)
  - unfitting, balanced (ideal) , overfitting

### Experimentation














