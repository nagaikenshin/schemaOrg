package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CODE_REPOSITORY;
import org.kyojo.schemaOrg.m3n3.core.Container.CodeRepository;

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
