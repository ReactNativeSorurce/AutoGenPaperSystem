const GET_KNOWLEDGE_POINTS = 'GET_KNOWLEDGE_POINTS',
      GET_QUESTION_TYPE = 'GET_QUESTION_TYPE',
      GET_DEGREE_OF_DIFFICULTY = 'GET_DEGREE_OF_DIFFICULTY',
      GET_FEATURES = 'GET_FEATURES',
      GET_QUESTIONS = 'GET_QUESTIONS';

export default getKnowledgePoints() {
  return {
    type: 'GET_KNOWLEDGE_POINTS',
  }
}

export default getQuestionType() {
  return {
    type: 'GET_QUESTION_TYPE'
  }
}

export default getDegreeOfDifficulty() {
  return {
    type: 'GET_DEGREE_OF_DIFFICULTY'
  }
}

export default getGET_Features() {
  return {
    type: 'GET_FEATURES'
  }
}

export default getQuestions() {
  return {
    type: 'GET_QUESTIONS'
  }
}