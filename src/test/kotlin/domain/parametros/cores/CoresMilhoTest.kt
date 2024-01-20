package domain.parametros.cores

import br.ufu.classisafra.model.parametros.cores.CoresMilho
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CoresMilhoTest {
    @Test
    fun `valores iniciais dentro do intervalo`() {
        val coresMilho = CoresMilho(
            amarelosEmPorcentagem = 30.0,
            brancosEmPorcentagem = 20.0,
            coloridosEmPorcentagem = 50.0
        )

        assertEquals(30.0, coresMilho.amarelosEmPorcentagem)
        assertEquals(20.0, coresMilho.brancosEmPorcentagem)
        assertEquals(50.0, coresMilho.coloridosEmPorcentagem)
    }

    @Test
    fun `valores iniciais maiores que 100`() {
        assertThrows<IllegalArgumentException> {
            CoresMilho(
                amarelosEmPorcentagem = 120.0,
                brancosEmPorcentagem = 101.0,
                coloridosEmPorcentagem = 110.0
            )
        }
    }

    @Test
    fun `valores iniciais menores que 0`() {
        assertThrows<IllegalArgumentException> {
            CoresMilho(
                amarelosEmPorcentagem = -10.0,
                brancosEmPorcentagem = -5.0,
                coloridosEmPorcentagem = -1.0
            )
        }
    }
}