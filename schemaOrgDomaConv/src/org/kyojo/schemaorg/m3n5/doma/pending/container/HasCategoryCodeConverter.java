package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HAS_CATEGORY_CODE;
import org.kyojo.schemaorg.m3n5.pending.Container.HasCategoryCode;

@ExternalDomain
public class HasCategoryCodeConverter implements DomainConverter<HasCategoryCode, String> {

	@Override
	public String fromDomainToValue(HasCategoryCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasCategoryCode fromValueToDomain(String value) {
		return new HAS_CATEGORY_CODE(value);
	}

}
