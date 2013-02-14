package br.com.caelum.brutal.integration.scene;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest extends AcceptanceTestBase{

	@Test
	public void should_list_unsolved_questions() {
		boolean hasOnlyUnsolvedQuestions = 
				home()
				.toUnsolvedList()
				.hasOnlyUnsolvedQuestions();
		assertTrue(hasOnlyUnsolvedQuestions);
	}

	@Test
	public void should_list_by_tag() {
		String tag = "java";
		boolean hasOnlyQuestionsWithTheTag = 
				home()
				.toWithTagList(tag)
				.hasOnlyQuestionsWithTag(tag);
		assertTrue(hasOnlyQuestionsWithTheTag);
	}

}