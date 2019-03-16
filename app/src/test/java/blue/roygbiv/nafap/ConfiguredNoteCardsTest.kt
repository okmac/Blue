package blue.roygbiv.nafap

import org.amshove.kluent.`should equal`
import org.junit.Test

class ConfiguredNoteCardsTest {
    var subject = ConfiguredNoteCards()

    @Test
    fun iterate_over_NoteCards() {
        (0..5).forEach { x ->
            run {
                var foundCard = subject.getNextNoteCard()
                var expectedCard = subject.noteCards[x]
                foundCard.name `should equal` expectedCard.name
            }
        }
    }

    @Test
    fun iterator_set_to_0_after_reach_end_of_list() {
        (0 until subject.noteCards.size).forEach {
            run {
                var foundCard = subject.getNextNoteCard()
            }
        }

        subject.getNextNoteCard().name `should equal` subject.noteCards[0].name
        subject.getNextNoteCard().name `should equal` subject.noteCards[1].name
    }
}
