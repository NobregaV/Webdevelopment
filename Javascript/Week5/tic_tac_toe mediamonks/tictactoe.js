const board = {
    player1: "X",
    player2: "O",
    currentTurn: "X",
    allBoxFilled: true,
    someoneHasWon: false
}

const winningConditions = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [1, 4, 7],
    [2, 5, 8],
    [3, 6, 9],
    [1, 5, 9],
    [3, 5, 7]
]

function play(tileNr) {
    if (board.currentTurn === board.player1) {
        document.getElementById(tileNr).innerText = "X";
        board.currentTurn = board.player2;
    } else {
        document.getElementById(tileNr).innerText = "O";
        board.currentTurn = board.player1;
    }

    // controleren of iemand gewonnen heeft.
    for(let i=0; i<winningConditions.length; i++) {
        // console.log(winningConditions[i]);
        // console.log(winningConditions[i][0]);
        // console.log(winningConditions[i][1]);
        // console.log(winningConditions[i][2]);
        // console.log(document.getElementById(winningConditions[i][0]).innerText);
        // console.log(document.getElementById(winningConditions[i][1]).innerText);
        // console.log(document.getElementById(winningConditions[i][2]).innerText);
        // console.log("=====================");
        if (document.getElementById(winningConditions[i][0]).innerText === board.player1 && 
            document.getElementById(winningConditions[i][1]).innerText === board.player1 && 
            document.getElementById(winningConditions[i][2]).innerText === board.player1) {
                console.log("Player X has won");
                board.someoneHasWon = true;
        } else if (
            document.getElementById(winningConditions[i][0]).innerText === board.player2 && 
            document.getElementById(winningConditions[i][1]).innerText === board.player2 && 
            document.getElementById(winningConditions[i][2]).innerText === board.player2
        ) {
            console.log("Player O has won");
            board.someoneHasWon = true;
        } else {
            // code om te bepalen of het gelijkspel is.
            board.allBoxFilled = true;
            for (let i=1; i<=9; i++) {
                if (!document.getElementById(i).innerText) {
                    // console.log("is filled")
                    board.allBoxFilled = false;
                }
            }

            if (board.allBoxFilled && !board.someoneHasWon) {
                console.log("Draw game");
                return
            }
        }
    }
}

function reset() {
    if (board.someoneHasWon) {
        for (let i=1; i<=9; i++) {
            document.getElementById(i).innerText = "";

            board.currentTurn = "X";
            board.allBoxFilled = true;
            board.someoneHasWon = false;
        }
    }

    if (board.allBoxFilled && !board.someoneHasWon) {
        for (let i=1; i<=9; i++) {
            document.getElementById(i).innerText = "";

            board.currentTurn = "X";
            board.allBoxFilled = true;
            board.someoneHasWon = false;
        }
    }
}