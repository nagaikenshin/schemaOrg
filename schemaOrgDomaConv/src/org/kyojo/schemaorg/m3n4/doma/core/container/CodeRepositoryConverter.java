package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CODE_REPOSITORY;
import org.kyojo.schemaorg.m3n4.core.Container.CodeRepository;

@ExternalDomain
public class CodeRepositoryConverter implements DomainConverter<CodeRepository, String> {

	@Override
	public String fromDomainToValue(CodeRepository domain) {
		return domain.getNativeValue();
	}

	@Override
	public CodeRepository fromValueToDomain(String value) {
		return new CODE_REPOSITORY(value);
	}

}
