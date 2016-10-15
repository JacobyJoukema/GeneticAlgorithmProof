# GeneticAlgorithmProof
# Overview
This code is a general proof of concept for a basic genetic algorithm. The code evolves to match a specified key phrase.
# Fitness Function
The fitness function is equal to the number of correct letters over the total number of letters squared. This gives generated phrases exponentially higher fitness based on how many correct letters they have.
# Mutation
The mutation rate is the percent chance that any character in a generations population children will change. For example if the child is 'abc' the mutation rate is the chance that a is changed or b is changed or c is changed. It is possible to have every letter change with this mutation implementation.
