package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryRepositoryTest {

	MemoryMemberRepository repository = new MemoryMemberRepository();

	@Test
	public void save() {
		Member member = new Member();
		member.setName("spring");
		repository.save(member);
		Member result = repository.findById(member.getId()).get();
		assertThat(result).isEqualTo(member);
	}

}
