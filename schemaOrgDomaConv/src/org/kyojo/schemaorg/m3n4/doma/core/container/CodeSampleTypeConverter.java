package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CODE_SAMPLE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.CodeSampleType;

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
