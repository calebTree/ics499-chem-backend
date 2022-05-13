package edu.metrostate.ics499.team2.repository;

import edu.metrostate.ics499.team2.repositories.ElementRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ElementRepoIntegrationTests {

    @Autowired
    private ElementRepository elementRepo;

    @Test
    @DisplayName("should instantiate the repo")
    void testInit() {
        assertNotNull(elementRepo);
    }

//	@Test
//	@DisplayName("should find element with symbol H in the repo")
//	void testFindBySymbol() {
//		Element elm = elementRepo.findElementBySymbol("H");
//		assertEquals(elm.getSymbol(), "H");
//	}

}
