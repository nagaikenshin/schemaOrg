package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CODE_VALUE;
import org.kyojo.schemaorg.m3n5.pending.Container.CodeValue;

@ExternalDomain
public class CodeValueConverter implements DomainConverter<CodeValue, String> {

	@Override
	public String fromDomainToValue(CodeValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public CodeValue fromValueToDomain(String value) {
		return new CODE_VALUE(value);
	}

}
