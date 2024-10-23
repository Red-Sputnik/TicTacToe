# Крестики-Нолики (Tic-Tac-Toe)

## Описание
**Крестики-нолики** — это классическая настольная игра для двоих игроков. Игра проходит на квадратной сетке 3x3, где один игрок ставит "X", а другой — "O". Цель игры — составить линию из трёх своих символов по горизонтали, вертикали или диагонали.

## Технологии
- Java SE
- ООП (Объектно-Ориентированное Программирование)

## Установка
1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/ВашНикнейм/tic-tac-toe-java.git
   ```

2. Перейдите в директорию проекта:
   ```bash
   cd tic-tac-toe-java
   ```

3. Скомпилируйте проект:
   ```bash
   javac Main.java
   ```

4. Запустите игру:
   ```bash
   java Main
   ```

## Как играть
1. Запустите программу.
2. Сначала ходит **Игрок**, вводя координаты клетки (например, 1, 1 для верхнего левого угла), затем ходит **ИИ-ассистент**, случайным образом выбирая координаты клетки.
3. Программа проверяет состояние игры после каждого хода:
   - Если **Игрок** собрал линию из трёх символов, игра заканчивается.
   - Если **ИИ-ассистент** собрал линию из трёх символов, игра заканчивается.
   - Если все клетки заполнены и нет победителя, игра завершается ничьей.

## Возможности
- Игра против **ИИ-ассистента**.
- Простой и интуитивно понятный интерфейс.

## Авторы
- **Red-Sputnik**
