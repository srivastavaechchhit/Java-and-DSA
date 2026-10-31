# Backtracking
- Backtracking is essentially **recursion with returning or undoing choices**.
- It involves exploring solution paths step-by-step and turning back (backtracking) whenever a candidate path fails to satisfy feasibility constraints or after exploring a path to find alternative solutions.

## General Algorithmic Pattern

### Make a Choice
- Mark the current state as chosen or visited.
  
### Explore (Recurse)
- Make recursive calls to proceed to subsequent steps.

### Undo Choice (Backtrack)
- Revert the state (unmark visited status, undo swapping, or remove character) so that other recursive branches can reutilize the state.

---

<img width="1760" height="1073" alt="1_3jLYOFeSUR5_S1mPGvJbHg" src="https://github.com/user-attachments/assets/5304e895-715d-40f1-a376-706e3d7e85f8" />

---
