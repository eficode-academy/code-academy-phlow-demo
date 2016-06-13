#include "dummy.hpp"
#include <gtest/gtest.h>

using namespace ::testing;

TEST(Whatever, whatever)
{
  ASSERT_EQ(2, answer());
}
