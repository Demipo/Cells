# Cells
Solution to interview question

## Description
Eight houses, represented as cells, are arranged in a straight line. Each day every cell competes with its adjacent cells (neighbors).
An integer value of 1 represents an active cell and a value of 0 represents an inactive cell. If the neighbors on both the sides of a cell are either active or inactive, the cell becomes inactive on the next day;
otherwise the cell becomes active. The two cells on each end have a single adjacent cell, so assume that the unoccupied space on the opposite side is an inactive cell.

Even after updating the cell state, consider its previous state when updating the state of other cells.
The state information of all cells should be updated simultaneously.

## Task
Write an algorithm to output the state of the cells after the given number of days. where input is array of integers, and n number of days

### Example 1
array = [1, 0, 0, 0, 0, 1, 0, 0]
number of days = 1

Output= 0 1 0 0 1 0 1 0

### Example 2
array = [1, 1, 1, 0, 1, 1, 1, 1]
number of days = 2

Output= 0 0 0 0 0 1 1 0
