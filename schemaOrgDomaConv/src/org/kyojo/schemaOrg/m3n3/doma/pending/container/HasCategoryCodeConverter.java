package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.HAS_CATEGORY_CODE;
import org.kyojo.schemaOrg.m3n3.pending.Container.HasCategoryCode;

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
