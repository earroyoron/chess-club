/** 
 * Models a chess player.
 */

 import java.util.UUID

/**
 * Represents a chess player with a unique identifier, name, surname, and FIDE Elo rating.
 *
 * @param id The unique identifier for the player.
 * @param name The player's first name.
 * @param surname The player's last name.
 * @param fideElo The player's current FIDE Elo rating.
 */
data class ChessPlayer(val id: UUID, val name: String, val surname: String, val fideElo: Int)
