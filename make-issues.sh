#!/usr/bin/env bash
set -ex
ghi open --message "Implement 1st test" --claim --label "Size 2 - medium" --label "Prio 1 - must have" --label "Status - workable"
ghi open --message "Implement 2nd test" --claim --label "Size 2 - medium" --label "Prio 1 - must have" --label "Status - workable"
ghi open --message "Implement 3rd test" --claim --label "Size 2 - medium" --label "Prio 2 - should have" --label "Status - workable"
ghi open --message "Implement 4th test" --claim --label "Size 2 - medium" --label "Prio 3 - could have" --label "Status - workable"
ghi open --message "Implement 5th test" --claim --label "Size 2 - medium" --label "Prio 3 - could have" --label "Status - workable"