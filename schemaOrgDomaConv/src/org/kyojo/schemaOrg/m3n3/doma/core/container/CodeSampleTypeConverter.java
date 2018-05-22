package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CODE_SAMPLE_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.CodeSampleType;

@ExternalDomain
public class CodeSampleTypeConverter implements DomainConverter<CodeSampleType, String> {

	@Override
	public String fromDomainToValue(CodeSampleType domain) {
		return domain.getNativeValue();
	}

	@Override
	public CodeSampleType fromValueToDomain(String value) {
		return new CODE_SAMPLE_TYPE(value);
	}

}
