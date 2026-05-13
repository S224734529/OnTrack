# OnTrack TDD CI Project

## Overview

This project develops a simplified OnTrack function using Java, JUnit, Maven, and GitHub Actions.

The selected function is a Task Submission Status Checker. It checks whether a student's task submission is on time, late, or invalid based on the due date and submission date.

## Function

The function accepts two input values:

- dueDate
- submissionDate

The function returns one of the following values:

- ON_TIME
- LATE
- INVALID_DATE

## Requirement Story

As an OnTrack student, I want the system to check whether my task submission is on time or late, so that I can understand my submission status before it is reviewed by a tutor.

The function should accept a task due date and a student submission date. If the submission date is before or equal to the due date, the system should return ON_TIME. If the submission date is after the due date, the system should return LATE. If either date is invalid, the system should return INVALID_DATE.

## Technologies Used

- Java
- JUnit 4
- Maven
- GitHub Actions

## How to Run Tests

```bash
mvn test
